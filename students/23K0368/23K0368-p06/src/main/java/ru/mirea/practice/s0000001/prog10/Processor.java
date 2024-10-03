package ru.mirea.practice.s0000001.prog10;

import java.util.Objects;

public class Processor {
    private String nameProcessor;
    private int countCores;

    public Processor(String nameProcessor, Integer countCores) {
        this.nameProcessor = nameProcessor;
        this.countCores = countCores;
    }

    public String getNameProcessor() {
        return nameProcessor;
    }

    public void setNameProcessor(String nameProcessor) {
        this.nameProcessor = nameProcessor;
    }

    public Integer getCountCores() {
        return countCores;
    }

    public void setCountCores(Integer countCores) {
        this.countCores = countCores;
    }

    @Override
    public String toString() {
        return "Processor{"
                + "nameProcessor='" + nameProcessor + '\''
                + ", countCores=" + countCores
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Processor other = (Processor) obj;
        return nameProcessor.equals(other.nameProcessor)
                && countCores == other.countCores;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProcessor, countCores);
    }
}