package reino_programacao.Services;

import reino_programacao.Interfaces.Lutador;

/**
 *
 * @author kstan
 */
public class Arena {

    public void duelar(Lutador lutador1, Lutador lutador2) {

        while (lutador1 instanceof Lutador && lutador2 instanceof Lutador) {
            lutador1.atacar();
            lutador2.receberDano(10);

            if (lutador1 instanceof Lutador && lutador1.getVida() <= 0) {
                System.out.println(lutador2.getClass().getSimpleName() + " é o campeão!");
                return;
            }

            if (lutador2 instanceof Lutador && lutador2.getVida() <= 0) {
                System.out.println(lutador1.getClass().getSimpleName() + " é o campeão!");
                return;
            }

            if (lutador1 instanceof Lutador && lutador2 instanceof Lutador) {
                lutador2.atacar();
                lutador1.receberDano(10);
            }
        }

    }
}
