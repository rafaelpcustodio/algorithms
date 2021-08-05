package NinjaCode;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class Cep {
    private final String initialCode;
    private final String endCode;

    public Cep(final String initialCode, final String endCode) {
        this.initialCode = requireNonNull(initialCode, "Initial code must not be null.");
        this.endCode = requireNonNull(endCode, "End code must not be null.");
    }

    public String getInitialCode() {
        return initialCode;
    }

    public String getEndCode() {
        return endCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cep cep = (Cep) o;
        return Objects.equals(initialCode, cep.initialCode) && Objects.equals(endCode, cep.endCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialCode, endCode);
    }
}
