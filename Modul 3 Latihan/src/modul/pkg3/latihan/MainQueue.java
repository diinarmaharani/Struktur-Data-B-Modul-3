/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg3.latihan;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ASUS
 */
public class MainQueue {
    public void queueExample() {
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");

        System.out.print("remove : " + queue.remove());
        System.out.print("element : " + queue.element());
        System.out.print("poll : " + queue.poll());
        System.out.print("peek : " + queue.peek());
    }
    
    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
}
