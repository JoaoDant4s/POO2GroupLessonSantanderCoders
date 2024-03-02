public class MotoEspecial extends Moto implements SistemaDeTransporte, ModuloEletrico{

    public MotoEspecial(
            String modelo,
            Integer ano
    ) {
        super(modelo, ano);
    }

    @Override
    public void ativarModoEco() {
        System.out.println("Ativando modo eco da moto especial");
    }

    @Override
    public void carregar(int voltagem) {
        System.out.println("Voltagem: " + voltagem);
    }

    @Override
    public void controleDeCarga(double peso, int distancia) {
        System.out.println("Controlando carga da moto especial");
    }

    @Override
    public void calcularRota(String[] pontosDeEntrega) {
        System.out.println("Calculando rota da moto especial");
    }
}
