package gg.corz;

public record liiIilliiiIill(boolean empty, String name, boolean greenPane) {
   private final String iliiIiIIiIiiiIiIIi;
   public static final liiIilliiiIill IIIIliIIilIIIliIIi = new liiIilliiiIill(true, "", false);
   private final boolean IliiIiIIilliiIiIIi;
   private final boolean liiiIiIIiiiiiIiIIi;

   public liiIilliiiIill(boolean empty, String name, boolean greenPane) {
      this.IliiIiIIilliiIiIIi = empty;
      this.iliiIiIIiIiiiIiIIi = name;
      this.liiiIiIIiiiiiIiIIi = greenPane;
   }

   public String liiiIIllIl() {
      return this.iliiIiIIiIiiiIiIIi;
   }

   public boolean iIlIlllllill() {
      return this.liiiIiIIiiiiiIiIIi;
   }

   public boolean IliIlllilIi() {
      return this.IliiIiIIilliiIiIIi;
   }
}
