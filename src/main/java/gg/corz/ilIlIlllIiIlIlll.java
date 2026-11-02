package gg.corz;

public record ilIlIlllIiIlIlll(int x, int y, int z, int facing, lIiIiilliIiIiill type, boolean trapped) {
   private final int illllIIill;
   private final int IilllIIill;
   private final int lllllIIill;
   private final boolean IIillIIill;
   private final lIiIiilliIiIiill lilllIIill;
   private final int IllllIIill;

   public int liiiIIllIl() {
      return this.IllllIIill;
   }

   public ilIlIlllIiIlIlll(int x, int y, int z, int facing, lIiIiilliIiIiill type, boolean trapped) {
      this.IllllIIill = x;
      this.lllllIIill = y;
      this.illllIIill = z;
      this.IilllIIill = facing;
      this.lilllIIill = type;
      this.IIillIIill = trapped;
   }

   public int IilliliilIIi() {
      return this.illllIIill;
   }

   public int iIlIlllllill() {
      return this.lllllIIill;
   }

   public boolean IIIllIIliIIl() {
      return this.IIillIIill;
   }

   public int lIiiIiIlilli() {
      return this.IilllIIill;
   }

   public long IliIlllilIi() {
      return IIliliIllIliliIl.IliIlllilIi(this.IllllIIill, this.lllllIIill, this.illllIIill);
   }

   public lIiIiilliIiIiill iliIiiliiiii() {
      return this.lilllIIill;
   }
}
