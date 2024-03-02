public class CaminhaoEletrico extends Caminhao implements ModuloEletrico{

    public CaminhaoEletrico(
            String modelo,
            Integer ano
    ) {
        super(modelo, ano);
    }

    @Override
    public void ativarModoEco() {
        System.out.println("ativando modo eco do caminhão elétrico");
    }

    public void carregar(int voltagem) {
        System.out.println("controlando carga do caminhão elétrico");
    }
}
