
public class ContratoResidencia extends ClienteFisico{
	
	float seguro;
	float porcentagem;
	
	public float getSeguro() {
		return seguro;
	}

	public void setSeguro(float seguro) {
		this.seguro = seguro;
	}
	
	public float getPorcentagem(){
		return porcentagem;
	}
	public void setPorcentagem(float porcentagem){
		this.porcentagem = porcentagem;
	}
	
	public void valorporcentagem(){
		if(zona==1){
			this.porcentagem= 0.01f;
		}
		if(zona==2){
			this.porcentagem = 0.005f;
		}
		if(zona==3){
			this.porcentagem = 0f;
		}
	}
	
	
	
	void CalularSeguro(){
		
		seguro = (0.02f * valorImovel) + (porcentagem * valorImovel);
		if(tipoResidencia == 2){
			seguro +=(0.005 * valorImovel);
		}
		
	}

}
