package gg.corz;

public record liIiiiIiiiIiiiIi(int yaw, int pitch) {
   private final int IlIIiIIlIi;
   private final int llIIiIIlIi;
   public static final liIiiiIiiiIiiiIi ilIIiIIlIi = new liIiiiIiiiIiiiIi(0, 0);

   public int iIlIlllllill() {
      return this.IlIIiIIlIi;
   }

   public boolean IliIlllilIi() {
      return this.IlIIiIIlIi == 0 && this.llIIiIIlIi == 0;
   }

   static int liiiIIllIl(int delta, int limit, int net) {
      long var3 = Math.max((long)(-net), Math.min((long)net, (long)delta + (long)limit));
      return (int)(var3 - (long)delta);
   }

   public int IilliliilIIi() {
      return this.llIIiIIlIi;
   }

   public liIiiiIiiiIiiiIi(int yaw, int pitch) {
      this.IlIIiIIlIi = yaw;
      this.llIIiIIlIi = pitch;
   }
}
