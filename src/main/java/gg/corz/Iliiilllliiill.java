package gg.corz;

import java.util.Locale;

public record Iliiilllliiill(IIIIlIilIIIlIi verdict, int postComponentSize, String why) {
   private final int IllilllIilllilllIi;
   private final String illilllIiIililllIi;
   private final IIIIlIilIIIlIi lIlilllIiiIlilllIi;

   public String iliIiiliiiii() {
      return this.illilllIiIililllIi;
   }

   public IIIIlIilIIIlIi IilliliilIIi() {
      return this.lIlilllIiiIlilllIi;
   }

   public boolean liiiIIllIl() {
      return this.lIlilllIiiIlilllIi == IIIIlIilIIIlIi.iliIiIIiiIiiIiIIii;
   }

   public Iliiilllliiill(IIIIlIilIIIlIi verdict, int postComponentSize, String why) {
      this.lIlilllIiiIlilllIi = verdict;
      this.IllilllIilllilllIi = postComponentSize;
      this.illilllIiIililllIi = why;
   }

   public int lIiiIiIlilli() {
      return this.IllilllIilllilllIi;
   }

   public String iIlIlllllill() {
      return String.format(
         Locale.ROOT,
         IIIllIIliIIl<"IIIllIIliIIl","njNiD2zoeNE/Z+UKcpeTO4n//X8jKKKEKZQ8eAjXxGaLmrNWPoxQYEYo5Q==">(),
         this.lIlilllIiiIlilllIi,
         this.IllilllIilllilllIi,
         this.illilllIiIililllIi
      );
   }

   public boolean IliIlllilIi() {
      return this.lIlilllIiiIlilllIi != IIIIlIilIIIlIi.iliIiIIiiIiiIiIIii;
   }
}
