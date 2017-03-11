
public class oldLadyWhoSwallowedAFly {

	public static void flyinit(){
		System.out.println("There was an old lady who swallowed a fly");
		System.out.println("I dont know why she swallowed a fly");
		System.out.println("Perhaps she'll die");
		System.out.println("But it's only a fly");
		System.out.println("But I think i'll cry");
		System.out.println("he gulped it out of the sky");
		System.out.println("Oh, my!");
	}
	public static void flyrepeat(){
		System.out.println("I don't know why");
		System.out.println("She swallowed the fly");
		System.out.println("Perhaps she'll die");
	}
	public static void spiderrepeat(){
		System.out.println("She swallowed the spider to catch the fly");
		flyrepeat();
	}
	public static void birdrepeat(){
		System.out.println("She swallowed the bird to catch the spider");
		spiderrepeat();
	}
	public static void catrepeat(){
		System.out.println("She swallowed the cat to catch the bird");
		birdrepeat();
	}
	public static void dogrepeat(){
		System.out.println("She swallowed the dog to catch the cat");
		catrepeat();
	}
	public static void cowrepeat(){
		System.out.println("She swallowed the cow to catch the dog");
		dogrepeat();
	}
	public static void spider(){
		System.out.println("There was an old lady who swalowed a spider");
		System.out.println("That wiggled and jiggled and tickled inside her.");
		spiderrepeat();
		System.out.println("Gone to the by and by");
		System.out.println("Sigh");
	}
	public static void bird(){
		System.out.println("There was an old lady who swalowed a bird");
		System.out.println("How absurd! She swallowed a bird!");
		birdrepeat();
		System.out.println("She'll leave us high and dry.");	
	}
	public static void cat(){
		System.out.println("There was an old lady who swalowed a cat");
		System.out.println("Imagine that! She swallowed a cat.");
		catrepeat();
		System.out.println("I hope it's a lie.");
	}
	public static void dog(){
		System.out.println("There was an old lady who swalowed a dog.");
		System.out.println("She went whole hog to swallow a dog.");
		dogrepeat();
		System.out.println("There's a tear in my eye.");
	}
	public static void cow(){
		System.out.println("There was an old lady who swalowed a cow.");
		System.out.println("I dont't know how she swallowed a cow");
		cowrepeat();
		System.out.println("I'd rather have ham on rye.");
		System.out.println("And she had a frog on the sly");
		System.out.println("She did it in one try.");
	}
	public static void horse(){
		System.out.println("There was an old lady who swallowed a horse");
		System.out.println("She died, of course.");
		System.out.println("It was the last course.");
		System.out.println("I'm filled with remorse.");
		System.out.println("What's left to say.");
		System.out.println("Even the artist is crying.");
		System.out.println("We'll miss her dearly.");
		System.out.println("It's such a loss.");
		System.out.println("She had no tme to floss.");
		System.out.println("She missed out on the sauce");
		System.out.println("");
		System.out.println("Moral: Never swallow a horse.");
	}
	public static void main(String[] args) {
		flyinit();
		System.out.println("");
		spider();
		System.out.println("");
		bird();
		System.out.println("");
		cat();
		System.out.println("");
		dog();
		System.out.println("");
		cow();
		System.out.println("");
		horse();
		
			
	}
}
