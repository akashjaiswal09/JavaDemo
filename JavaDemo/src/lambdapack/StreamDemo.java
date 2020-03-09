package lambdapack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		String[] sarr= {"one","two","three","four"};
		Stream<String> stream = Arrays.stream(sarr);
		
		Stream<Integer> intstream = Stream.of(10,20,30);
		System.out.println(intstream.reduce((a,b)->a+b).get());
		
		List<String> strlist = new ArrayList<>();
		strlist.add("ram");
		strlist.add("ria");
		strlist.add("johnny");
		
		Stream<String> listStream = strlist.stream();
		
//		listStream.forEach(System.out::println);
//		listStream.map(s->s.toUpperCase()).forEach(System.out::println);;
//		listStream.filter(s->s.length()==3?true:false).map(s->s.toUpperCase()).forEach(System.out::println);;
//		System.out.println(listStream.map(s->s.length()).reduce((a,b)->a+b).get());
		
//		List<String> s1=listStream.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(listStream.map(s->s.toUpperCase()).count());
//		System.out.println(s1);
		
		
		
	}

}
