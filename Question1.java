abstract class Bharatvanshi {
    abstract void fight(); }
abstract class Pandav extends Bharatvanshi {
    void obey() {
        System.out.println("Pandav obeys elders"); }
    abstract void kind(); }
abstract class Kaurav extends Bharatvanshi {
    void disobey() {
        System.out.println("Kaurav disobeys"); }
    abstract void cruel(); }
class Arjun extends Pandav {
    public void fight() {
        System.out.println("Arjun fights bravely"); }
    public void kind() {
        System.out.println("Arjun is kind"); } }
class Bheem extends Pandav {
    public void fight() {
        System.out.println("Bheem fights powerfully"); }
    public void kind() {
        System.out.println("Bheem is less kind"); } }
class Duryodhan extends Kaurav {
    public void fight() {
        System.out.println("Duryodhan fights fiercely"); }
    public void cruel() {
        System.out.println("Duryodhan is cruel"); }}
class Vikarn extends Kaurav {
    public void fight() {
        System.out.println("Vikarn fights nobly"); }
    public void cruel() {
        System.out.println("Vikarn is kind, not cruel"); } }
public class Question1 {
    public static void main(String[] args) {
        Arjun a = new Arjun();
        Bheem b = new Bheem();
        Duryodhan d = new Duryodhan();
        Vikarn v = new Vikarn();
        a.fight(); a.kind(); a.obey();
        b.fight(); b.kind(); b.obey();
        d.fight(); d.cruel(); d.disobey();
        v.fight(); v.cruel(); d.disobey(); } } 
