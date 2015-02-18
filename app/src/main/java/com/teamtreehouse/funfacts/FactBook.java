package com.teamtreehouse.funfacts;

import java.util.Random;

/**
 * Created by Auriel on 1/29/2015.
 */
public class FactBook {


    // Member variables (properties about the object)
   public String[] facts = {

            "Bed bug males stab females for insemination ",
            "There are between 80-100 million insect species worldwide some still to be found.",
            "There are 10 quintillion insects alive right now.",
            "Aphids are asexual, female aphids reproduce parthenogenetically, they are clones.",
            "Grylloblattid is an insect lives in ice caves and glaciers. They cannot survive in warm climates",
            "Walking stick eggs resemble seeds so predators cannot seem them.",
            "Ants are all female and males are produced only once a year for the mating flight",
            "DNA cannot be extracted from ancient fossilized insects in amber",
            "Entomophagy is the process of consuming insects for food",
            "Most world crops are attacked by insects causing billions in damage",
            "Insects will not take over the world, they already own it."
    };


    //Method (abilities: things the object can do)

    public String getFact() {

        String fact = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(facts.length);

        fact = facts[randomNumber];

        return fact;


    }


}
