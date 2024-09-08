package pkgdefault;

import java.time.LocalDate;

class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    // Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
