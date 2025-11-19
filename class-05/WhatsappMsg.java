class WhatsappMsg{
	private String msg; // end to end encrypted

	public void setMessage(String message){  // sender sends message ==> setter
         msg = message;
	}

	public String getMessage(){   // receiver reads message  ==> getter
        return msg;
	}

}
class Main{
   public static void main(String[] args) {
   	  WhatsappMsg chat = new WhatsappMsg();

   	  chat.setMessage("Ki korcho??"); // sender

      System.out.println("I have received msg : " +chat.getMessage()); // receiver

   }
}