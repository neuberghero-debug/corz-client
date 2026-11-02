package gg.corz;

public record iiIllliIIlllli(boolean forward, boolean jump, boolean sprint, liIIlllliiIIllll phase, boolean progress, String note) {
   private final boolean IlIiilIIIl;
   private final liIIlllliiIIllll iIIiilIIIl;
   private final boolean iiililIIIl;
   private final String llIiilIIIl;
   private final boolean lIIiilIIIl;
   private final boolean IIIiilIIIl;

   public boolean IliIlllilIi() {
      return this.iiililIIIl;
   }

   public String iliIiiliiiii() {
      return this.llIiilIIIl;
   }

   public liIIlllliiIIllll IilliliilIIi() {
      return this.iIIiilIIIl;
   }

   public boolean liiiIIllIl() {
      return this.IIIiilIIIl;
   }

   public iiIllliIIlllli(boolean forward, boolean jump, boolean sprint, liIIlllliiIIllll phase, boolean progress, String note) {
      this.iiililIIIl = forward;
      this.IIIiilIIIl = jump;
      this.lIIiilIIIl = sprint;
      this.iIIiilIIIl = phase;
      this.IlIiilIIIl = progress;
      this.llIiilIIIl = note;
   }

   public boolean lIiiIiIlilli() {
      return this.IlIiilIIIl;
   }

   public boolean iIlIlllllill() {
      return this.lIIiilIIIl;
   }
}
