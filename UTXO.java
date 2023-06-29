import java.util.List;

public class UTXO  {
    private String UTXO_key;
    private int amount;
    private String owner;
    private String tokenName;
    //private String tokenSymbol;
    private int supply; //토큰 발행수량
    private int supplylimit; // 발행 제한수량


    public String issueToken(int amount, String tokenname){
       //존재하는 토튼 여부
        return null;
    }


    //특정 UTXO를 amount만큼 분할한 뒤 분할한 amount UTXO key를 리턴
    public String split(int amount, UTXO token){
        return null;
    }
    //특정 account의UTXO에서 amount 만큼의 UTXO를 분할해서 return
    public String gather(int amount, String account){
        return null;
    }
    //두 UTXO를 병합하고 합친 UTXO의key를 리턴
    public static String merge(UTXO token1, UTXO token2){
        return null;
    }
    //특정 UTXO를 전송(소유권 변경)
    public static String transfer(UTXO token, String account){
        //해당 UTXO가 동결되지 않았는지 확인
        
        //token 소유권을 해당 account로 변경, 그 후 각자 계정의 balance 수정
        return null;
    }
    //가칭, 오더에 추가할 때 사용? 몰?르
    public static String place_order(int amount, String account){ 
        //해당 계정의 동결되지 않은 UTXO 잔액이 amount보다 많은지 확인

        //amount보다 큰 분량의 UTXO가 있는지 확인, 존재한다면 split으로 amount만큼의 UTXO를 분할하고 key를 리턴

        //amount보다 큰 UTXO가 없다면 순차적으로 amount보다 UTXO가 커질 때 까지 병합, 그 후 split하여 key값을 리턴.
        return null;
    }
    public static List<UTXO> getall(){
        return null;               
    }
}
