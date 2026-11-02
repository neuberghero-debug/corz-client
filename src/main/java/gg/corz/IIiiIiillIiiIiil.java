package gg.corz;

public final class IIiiIiillIiiIiil {
   private int iiliIIilil;
   private int liliIIilil;
   private int IIiiIIilil = -1;
   private String lIiiIIilil = "";
   private int iIiiIIilil;

   public boolean IliIlllilIi(int kind, String tick, int id) {
      long var5 = -3364592862671386071L;
      var5 ^= ((long)(this.IIiiIIilil < 0 ? 1 : 0) << 32 ^ var5) & -1L << 32;
      this.liliIIilil++;
      this.IIiiIIilil = kind;
      this.lIiiIIilil = tick;
      this.iIiiIIilil = id;
      return (boolean)((int)(var5 >>> 32));
   }

   public String IiIlliIliiIl() {
      return Illlllllilll<"Illlllllilll","/M4P/ztmbJdxN2XmPyDq3KYg8ILzz9QSDkv/OerHYy83/Ql036K4K0x/C36z">()
         + this.liliIIilil
         + Illlllllilll<"Illlllllilll","ETJRRfMkjOXSmcWiVXdGe7WHoJJN+YnPOtFJrQZ182mQ7Q0HoftPM52Z9g==">()
         + this.iiliIIilil
         + Illlllllilll<"Illlllllilll","0c8zvSnLGPJz7MjnXavJV0ChIMv5sw+Rc+Y6ua01wiLHk8YJ/kiJlzFy">()
         + (this.IIiiIIilil >= 0 ? 1 : 0);
   }

   public boolean IlIlllIlilIl() {
      return this.liliIIilil == this.iiliIIilil && this.IIiiIIilil < 0;
   }

   public boolean liiiIIllIl() {
      return this.IIiiIIilil >= 0;
   }

   public int iliIiiliiiii() {
      return this.liliIIilil;
   }

   public IiiIilliiIil lIiiIiIlilli(
      int tempPlaced,
      int confirmed,
      int verticalTransitions,
      int jumpTransitions,
      int tempRemoved,
      double travel,
      int attempted,
      int why,
      int plannedMembers,
      ilIiiIiIiIiiIi tick
   ) {
      if (this.IIiiIIilil < 0) {
         return null;
      } else {
         IiiIilliiIil var12 = new IiiIilliiIil(
            this.IIiiIIilil,
            this.lIiiIIilil,
            tempPlaced,
            confirmed,
            verticalTransitions,
            jumpTransitions,
            tempRemoved,
            travel,
            attempted,
            why,
            Math.max(0, plannedMembers - this.iIiiIIilil),
            tick
         );
         this.IIiiIIilil = -1;
         this.lIiiIIilil = "";
         this.iiliIIilil++;
         return var12;
      }
   }

   public int iIlIlllllill() {
      return this.IIiiIIilil;
   }

   public String IilliliilIIi() {
      return this.lIiiIIilil;
   }

   public void IIlllIlliIll() {
      this.liliIIilil = 0;
      this.iiliIIilil = 0;
      this.IIiiIIilil = -1;
      this.lIiiIIilil = "";
   }

   public int IIIllIIliIIl() {
      return this.iiliIIilil;
   }
}
