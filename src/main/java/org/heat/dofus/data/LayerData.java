package org.heat.dofus.data;

import java.util.List;

public class LayerData {
    int id;
    List<Cell> cells;

    public LayerData(int id, List<Cell> cells) {
        this.id = id;
        this.cells = cells;
    }

    public int getId() {
        return this.id;
    }

    public List<Cell> getCells() {
        return this.cells;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof LayerData)) return false;
        final LayerData other = (LayerData) o;
        return this.id == other.id;
    }

    public int hashCode() {
        return this.id;
    }

    public String toString() {
        return "LayerData(id=" + this.id + ")";
    }

    public static class Cell {
        short id;
        List<ElementData> elements;

        public Cell(short id, List<ElementData> elements) {
            this.id = id;
            this.elements = elements;
        }

        public short getId() {
            return this.id;
        }

        public List<ElementData> getElements() {
            return this.elements;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Cell)) return false;
            final Cell other = (Cell) o;
            if (this.id != other.id) return false;
            final Object this$elements = this.elements;
            final Object other$elements = other.elements;
            if (this$elements == null ? other$elements != null : !this$elements.equals(other$elements)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + this.id;
            final Object $elements = this.elements;
            result = result * PRIME + ($elements == null ? 0 : $elements.hashCode());
            return result;
        }

        public String toString() {
            return "LayerData.Cell(id=" + this.id + ")";
        }
    }
}
