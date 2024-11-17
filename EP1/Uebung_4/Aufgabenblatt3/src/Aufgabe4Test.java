
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Aufgabe4Test {
    Aufgabe4 testing = new Aufgabe4();

    public Aufgabe4Test() {
    }

    @Test
    void testStartAndEndSeq() {
        Assertions.assertAll("Testing sequence start and end", new Executable[]{() -> {
            Boolean var10000 = true;
            Aufgabe4 var10001 = this.testing;
            Assertions.assertEquals(var10000, Aufgabe4.isStartAndEndSeq("AA", "A"), "AA, A -> true");
        }, () -> {
            Boolean var10000 = true;
            Aufgabe4 var10001 = this.testing;
            Assertions.assertEquals(var10000, Aufgabe4.isStartAndEndSeq("ABBAB", "AB"), "ABBAB, AB -> true");
        }, () -> {
            Boolean var10000 = false;
            Aufgabe4 var10001 = this.testing;
            Assertions.assertEquals(var10000, Aufgabe4.isStartAndEndSeq("ABBBA", "AB"), "ABBBA, AB -> false");
        }, () -> {
            Boolean var10000 = true;
            Aufgabe4 var10001 = this.testing;
            Assertions.assertEquals(var10000, Aufgabe4.isStartAndEndSeq("ottootto", "otto"), "ottootto, otto -> true");
        }, () -> {
            Boolean var10000 = false;
            Aufgabe4 var10001 = this.testing;
            Assertions.assertEquals(var10000, Aufgabe4.isStartAndEndSeq("otto", "otto"), "otto, otto -> false");
        }, () -> {
            Boolean var10000 = false;
            Aufgabe4 var10001 = this.testing;
            Assertions.assertEquals(var10000, Aufgabe4.isStartAndEndSeq("ottotto", "otto"), "ottotto, otto -> false");
        }});
    }
}
