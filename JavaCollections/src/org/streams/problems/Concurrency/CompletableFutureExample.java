package org.streams.problems.Concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("🚀 [Main] Starting checkout process on thread: " + Thread.currentThread().getName());

        long startTime = System.currentTimeMillis();

        // 1. Run Task A asynchronously: Fetch User Profile
        CompletableFuture<String> userTask = CompletableFuture.supplyAsync(() -> {
            simulateDelay(1500); // Simulating network latency
            System.out.println("👤 [Async] Fetched user details on thread: " + Thread.currentThread().getName());
            return "test name";
        });

        // 2. Run Task B asynchronously: Calculate Shipping Cost
        CompletableFuture<Double> shippingTask = CompletableFuture.supplyAsync(() -> {
            simulateDelay(1000); // Simulating database/API lookup
            System.out.println("📦 [Async] Calculated shipping cost on thread: " + Thread.currentThread().getName());
            return 12.50;
        });

        // 3. Combine the results of both tasks when they are BOTH finished
        CompletableFuture<String> invoiceTask = userTask.thenCombine(shippingTask, (userName, shippingCost) -> {
            System.out.println("📝 [Combine] Generating invoice on thread: " + Thread.currentThread().getName());
            return "Invoice for " + userName + " | Total Shipping: $" + shippingCost;
        });

        // 4. Do some independent work on the main thread while background tasks run
        System.out.println("⏳ [Main] Doing other work on main thread...");
        simulateDelay(500);
        System.out.println("⏳ [Main] Still waiting for background tasks...");

        // 5. Block and get the final result (or use .thenAccept() to handle it completely async)
        String finalInvoice = invoiceTask.get();
        System.out.println("\n🎉 Final Result: " + finalInvoice);

        long endTime = System.currentTimeMillis();
        System.out.println("⏱️ Total Execution Time: " + (endTime - startTime) + "ms");
    }

    // Helper method to simulate time-consuming tasks
    private static void simulateDelay(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
