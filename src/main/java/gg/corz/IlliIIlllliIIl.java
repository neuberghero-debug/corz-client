package gg.corz;

public record IlliIIlllliIIl(
   long target,
   long support,
   boolean supportTopFull,
   boolean headroomClear,
   boolean feetOnTarget,
   boolean materialInHand,
   boolean plainOrExactState,
   String reject
) {
   private final long IIilliiIllIilliiIl;
   private final String IlIiliiIlllIiliiIl;
   private final boolean lIIiliiIliIIiliiIl;
   private final boolean llilliiIlililliiIl;
   private final boolean iIilliiIlIlilliiIl;
   private final boolean IiilliiIlliilliiIl;
   private final boolean iiilliiIlIIIiliiIl;
   private final long lillliiIliillliiIl;

   public static IlliIIlllliIIl liiiIIllIl(
      long headroomClear, long feetOnTarget, boolean support, boolean materialInHand, boolean target, boolean plainOrExactState, boolean supportTopFull
   ) {
      String var9 = null;
      if (!target) {
         var9 = Illlllllilll<"Illlllllilll","GrAg022+vXXWft5go1rDerW+AkFIc8rCyeV1N0Tt/PY6uCZoHWTHOUFdW1706g==">();
      } else if (!support) {
         var9 = Illlllllilll<"Illlllllilll","z6uYQlM03YyiFt0XK6toDuiPdGy1UKX4XGUDRTXKkZejJzcozS93AzEv393D7+k9">();
      } else if (!materialInHand) {
         var9 = Illlllllilll<"Illlllllilll","mTI7VtS4DHNcijyaCuHIwt55Rm4osCvQbgvUNWief03x1nSj64lx">();
      } else if (!plainOrExactState) {
         var9 = Illlllllilll<"Illlllllilll","jW/Mni+YpHgKue9WSbiKQi6DbNrqOPU7ka8DIi/FsF+ai623RU/+">();
      } else if (!supportTopFull) {
         var9 = Illlllllilll<"Illlllllilll","qXozSUTfLLBbUwUiOLVAdwumhngVrvCRIB+ASGb1nn8J9QZMnd8zNsio/q0Cmg==">();
      }

      return new IlliIIlllliIIl(headroomClear, feetOnTarget, support, materialInHand, target, plainOrExactState, supportTopFull, var9);
   }

   public boolean IIIllIIliIIl() {
      return this.IiilliiIlliilliiIl;
   }

   public long iIlIlllllill() {
      return this.lillliiIliillliiIl;
   }

   public long IilliliilIIi() {
      return this.IIilliiIllIilliiIl;
   }

   public boolean lIiiIiIlilli() {
      return this.iIilliiIlIlilliiIl;
   }

   public boolean IlIlllIlilIl() {
      return this.iiilliiIlIIIiliiIl;
   }

   public boolean iliIiiliiiii() {
      return this.llilliiIlililliiIl;
   }

   public boolean IiIlliIliiIl() {
      return this.lIIiliiIliIIiliiIl;
   }

   public IlliIIlllliIIl(
      long target,
      long support,
      boolean supportTopFull,
      boolean headroomClear,
      boolean feetOnTarget,
      boolean materialInHand,
      boolean plainOrExactState,
      String reject
   ) {
      this.lillliiIliillliiIl = target;
      this.IIilliiIllIilliiIl = support;
      this.iIilliiIlIlilliiIl = supportTopFull;
      this.llilliiIlililliiIl = headroomClear;
      this.IiilliiIlliilliiIl = feetOnTarget;
      this.iiilliiIlIIIiliiIl = materialInHand;
      this.lIIiliiIliIIiliiIl = plainOrExactState;
      this.IlIiliiIlllIiliiIl = reject;
   }

   public boolean IliIlllilIi() {
      return this.IlIiliiIlllIiliiIl == null;
   }

   public String IIlllIlliIll() {
      return this.IlIiliiIlllIiliiIl;
   }
}
