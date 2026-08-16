interface FlyBehavior {
    void fly(); }
class CanFly implements FlyBehavior {
    public void fly() {
        System.out.println("This duck can fly"); } }
class CannotFly implements FlyBehavior {
    public void fly() {
        System.out.println("This duck cannot fly"); } }
interface SoundBehavior {
    void sound(); }
class Squeak implements SoundBehavior {
    public void sound() {
        System.out.println("Squeak"); } }
class Quack implements SoundBehavior {
    public void sound() {
        System.out.println("Quack"); } }
class Mute implements SoundBehavior {
    public void sound() {
        System.out.println("Silent"); } }
abstract class Duck {
    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;
    void swim() {
        System.out.println("Duck swims"); }
    void performFly() {
        flyBehavior.fly(); }
    void performSound() {
        soundBehavior.sound(); } } 
class RubberDuck extends Duck {
    RubberDuck() { flyBehavior = new CannotFly();
        soundBehavior = new Squeak(); } }
class WoodenDuck extends Duck {
    WoodenDuck() { flyBehavior = new CannotFly();
        soundBehavior = new Mute(); } }
class RedHeadDuck extends Duck {
    RedHeadDuck() { flyBehavior = new CanFly();
        soundBehavior = new Quack(); } }
class LakeDuck extends Duck {
    LakeDuck() { flyBehavior = new CanFly();
        soundBehavior = new Quack(); } } 
public class Question3 {public static void main(String[] args) {
        Duck d1 = new RubberDuck();
        Duck d2 = new WoodenDuck();
        Duck d3 = new RedHeadDuck();
        d1.swim(); d1.performFly(); d1.performSound();
        d2.swim(); d2.performFly(); d2.performSound();
        d3.swim(); d3.performFly(); d3.performSound(); } }
