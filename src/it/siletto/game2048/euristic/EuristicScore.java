package it.siletto.game2048.euristic;

public interface EuristicScore {

	public abstract int calculateScore(int actualScore, int numberOfEmptyCells, int clusteringScore);

}
