package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import support.domain.Pet;

public class AnimalStepDedinition {
    @Dado("que eu possua animais disponíveis")
    public void queEuPossuaAnimaisDisponiveis() {
        Pet pet = Pet.builder().build();
    }

    @Quando("eu pesquiso todos os animais disponíveis")
    public void euPesquisoTodosOsAnimaisDisponiveis() {
    }

    @Então("eu recebo a lista de animais disponpiveis")
    public void euReceboAListaDeAnimaisDisponpiveis() {
    }
}
