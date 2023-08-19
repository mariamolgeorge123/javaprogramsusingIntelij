package AbstractionExample.Interface.AnimalPackage;

public class AnimalRunner {
    public static void main(String[] args) {
//        Animal l=new Lion();
//        l.feed();
//        l.makeSound();
//
//        Monkey m=new Monkey();
//        m.climb();
//
//        Penguin p=new Penguin();
//        p.swim();




        //other method

        Lion l=new Lion();
        Monkey m=new Monkey();
        Penguin p=new Penguin();

        Animal[] animals={l,m,p};
        for(Animal an:animals )
        {
            an.feed();
            an.makeSound();
            if(an instanceof ClimbAnimal)
            {
//                ClimbAnimal cl=(ClimbAnimal) an;
//                ((ClimbAnimal) an).climb();
                ((ClimbAnimal) an).climb();
            }
            if (an instanceof AquaticAnimals)
            {
                AquaticAnimals aq=(AquaticAnimals) an;
                aq.swim();

//                ((AquaticAnimals) an).swim();

            }
        }


    }
}
