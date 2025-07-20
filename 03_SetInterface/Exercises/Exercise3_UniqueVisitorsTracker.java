/**
 * Exercise 3.3: Unique Visitors Tracker
 *
 * Objective: Simulate a website visitor tracking system using Set.
 *
 * Tasks:
 * 1. Generate random visitor IDs throughout a day
 * 2. Use Set to track unique visitors
 * 3. Implement features:
 *    - Count unique visitors per hour
 *    - Find peak traffic hours
 *    - Compare daily unique visitors across different days
 *    - Export visitor statistics
 */
import java.util.*;

public class Exercise3_UniqueVisitorsTracker {
    // TODO: Implement methods for visitor tracking and statistics
    public static void main(String[] args) {
        System.out.println("=== Unique Visitors Tracker Test Cases ===\n");
        
        // Test Case 1: Basic visitor tracking
        System.out.println("Test 1: Basic Visitor Tracking");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing visitor tracking methods
        /*
        Exercise3_UniqueVisitorsTracker tracker = new Exercise3_UniqueVisitorsTracker();
        
        // Simulate visitors for one day
        tracker.addVisitor("USER001", 9);  // 9 AM
        tracker.addVisitor("USER002", 9);  // 9 AM
        tracker.addVisitor("USER001", 10); // 10 AM (same user, different hour)
        tracker.addVisitor("USER003", 10); // 10 AM
        tracker.addVisitor("USER004", 11); // 11 AM
        tracker.addVisitor("USER002", 14); // 2 PM (same user, different hour)
        tracker.addVisitor("USER005", 14); // 2 PM
        
        System.out.println("Total unique visitors today: " + tracker.getTotalUniqueVisitors());
        System.out.println("Expected: 5 unique visitors");
        */
        System.out.println();
        
        // Test Case 2: Hourly visitor statistics
        System.out.println("Test 2: Hourly Visitor Statistics");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing hourly tracking methods
        /*
        tracker.displayHourlyStats();
        
        System.out.println("Unique visitors at 9 AM: " + tracker.getUniqueVisitorsForHour(9));
        System.out.println("Unique visitors at 10 AM: " + tracker.getUniqueVisitorsForHour(10));
        System.out.println("Unique visitors at 2 PM: " + tracker.getUniqueVisitorsForHour(14));
        */
        System.out.println();
        
        // Test Case 3: Peak traffic analysis
        System.out.println("Test 3: Peak Traffic Analysis");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing peak analysis methods
        /*
        int peakHour = tracker.getPeakTrafficHour();
        int peakCount = tracker.getUniqueVisitorsForHour(peakHour);
        System.out.printf("Peak traffic hour: %d:00 with %d unique visitors%n", peakHour, peakCount);
        
        List<Integer> topHours = tracker.getTopTrafficHours(3);
        System.out.println("Top 3 traffic hours: " + topHours);
        */
        System.out.println();
        
        // Test Case 4: Simulate full day traffic
        System.out.println("Test 4: Full Day Simulation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing simulation methods
        /*
        Exercise3_UniqueVisitorsTracker fullDayTracker = new Exercise3_UniqueVisitorsTracker();
        fullDayTracker.simulateFullDay(1000); // Simulate 1000 visits throughout the day
        
        System.out.println("Full day simulation results:");
        fullDayTracker.displayHourlyStats();
        System.out.println("Total unique visitors: " + fullDayTracker.getTotalUniqueVisitors());
        System.out.println("Peak hour: " + fullDayTracker.getPeakTrafficHour());
        */
        System.out.println();
        
        // Test Case 5: Multi-day comparison
        System.out.println("Test 5: Multi-Day Comparison");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing multi-day methods
        /*
        Map<String, Exercise3_UniqueVisitorsTracker> weeklyData = new HashMap<>();
        
        // Simulate a week of data
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] dailyVisits = {800, 750, 900, 850, 1200, 1500, 1100};
        
        for (int i = 0; i < daysOfWeek.length; i++) {
            Exercise3_UniqueVisitorsTracker dayTracker = new Exercise3_UniqueVisitorsTracker();
            dayTracker.simulateFullDay(dailyVisits[i]);
            weeklyData.put(daysOfWeek[i], dayTracker);
        }
        
        compareWeeklyTraffic(weeklyData);
        */
        System.out.println();
        
        // Test Case 6: Returning vs new visitors
        System.out.println("Test 6: Returning vs New Visitors Analysis");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing visitor analysis methods
        /*
        Exercise3_UniqueVisitorsTracker returningTracker = new Exercise3_UniqueVisitorsTracker();
        
        // Day 1 visitors
        Set<String> day1Visitors = Set.of("USER001", "USER002", "USER003", "USER004", "USER005");
        for (String visitor : day1Visitors) {
            returningTracker.addVisitor(visitor, 10);
        }
        
        // Day 2 visitors (some returning, some new)
        returningTracker.startNewDay();
        Set<String> day2Visitors = Set.of("USER002", "USER003", "USER006", "USER007", "USER008");
        for (String visitor : day2Visitors) {
            returningTracker.addVisitor(visitor, 11);
        }
        
        analyzeReturningVisitors(returningTracker);
        */
        System.out.println();
        
        // Test Case 7: Export statistics
        System.out.println("Test 7: Export Statistics");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing export methods
        /*
        String csvReport = tracker.exportToCsv();
        System.out.println("CSV Export Sample:");
        System.out.println(csvReport);
        
        String jsonReport = tracker.exportToJson();
        System.out.println("JSON Export Sample:");
        System.out.println(jsonReport);
        */
        System.out.println();
        
        // Test Case 8: Memory efficiency test
        System.out.println("Test 8: Memory Efficiency Test");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing efficiency methods
        /*
        Exercise3_UniqueVisitorsTracker memoryTracker = new Exercise3_UniqueVisitorsTracker();
        
        long startMemory = getUsedMemory();
        
        // Simulate heavy traffic
        memoryTracker.simulateFullDay(100000);
        
        long endMemory = getUsedMemory();
        long memoryUsed = endMemory - startMemory;
        
        System.out.printf("Memory used for 100,000 visits: %d bytes%n", memoryUsed);
        System.out.printf("Unique visitors tracked: %d%n", memoryTracker.getTotalUniqueVisitors());
        System.out.printf("Memory per unique visitor: %.2f bytes%n", 
                         (double) memoryUsed / memoryTracker.getTotalUniqueVisitors());
        */
        System.out.println();
        
        // Test Case 9: Real-time monitoring simulation
        System.out.println("Test 9: Real-Time Monitoring Simulation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing real-time methods
        /*
        Exercise3_UniqueVisitorsTracker realtimeTracker = new Exercise3_UniqueVisitorsTracker();
        
        System.out.println("Simulating real-time visitor monitoring...");
        simulateRealTimeMonitoring(realtimeTracker, 60); // 60 seconds of monitoring
        */
        System.out.println();
        
        // Test Case 10: Performance benchmarks
        System.out.println("Test 10: Performance Benchmarks");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing benchmark methods
        /*
        benchmarkSetImplementations();
        */
        System.out.println();
        
        System.out.println("=== Unique Visitors Tracker Test Cases Complete ===");
        System.out.println("Implement the following methods to run the tests:");
        System.out.println("- addVisitor(String visitorId, int hour)");
        System.out.println("- getTotalUniqueVisitors()");
        System.out.println("- getUniqueVisitorsForHour(int hour)");
        System.out.println("- displayHourlyStats()");
        System.out.println("- getPeakTrafficHour()");
        System.out.println("- getTopTrafficHours(int count)");
        System.out.println("- simulateFullDay(int totalVisits)");
        System.out.println("- startNewDay()");
        System.out.println("- exportToCsv()");
        System.out.println("- exportToJson()");
        System.out.println("- compareWeeklyTraffic(Map<String, Exercise3_UniqueVisitorsTracker>)");
        System.out.println("- analyzeReturningVisitors(Exercise3_UniqueVisitorsTracker)");
        System.out.println("- simulateRealTimeMonitoring(Exercise3_UniqueVisitorsTracker, int)");
        System.out.println("- benchmarkSetImplementations()");
        System.out.println("- getUsedMemory()");
    }
} 