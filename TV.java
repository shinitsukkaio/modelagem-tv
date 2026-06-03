class TV{
  int tamanho;
  int volume=5;
  string marca; 
  int voltagem;
  int canal;

  int aumentarvolume(){
    if(volume <10){
      volume++;
    }
    return volume;
  }

  int diminuirvolume(){
    if(volume>1){
      volume--;
    }
    return volume;
  }

  int voltagem(){
    
  
