package com.hileco.humanity.fourchan;

import com.hileco.humanity.ngram.NGramSentenceGenerator;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class FourchanBoardHarvesterSample {

    public static final String BOARD = "g";

    /**
     * Harvests {@link #BOARD} for a maximum of 5 minutes, then prints out sentences based on the trained 3-gram.
     *
     * @throws InterruptedException
     */
    @Test
    public void run() throws InterruptedException {
        NGramSentenceGenerator generator = new NGramSentenceGenerator(3);
        FourchanBoardHarvester harvester = new FourchanBoardHarvester(10);
        harvester.harvestBoard(generator, BOARD);
        harvester.awaitTermination(5, TimeUnit.MINUTES);
        for(int i = 0; i < 10; i++){
            System.out.println(generator.get());
        }
    }

}
