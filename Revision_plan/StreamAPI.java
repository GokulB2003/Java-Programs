import java.util.*;
import java.util.stream.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamAPI
{
    public static void main(String[] args) {
       List.of(10,203,2,4,5,1).stream().sorted().forEach((num)->System.out.println(num));
       
       

    }
}