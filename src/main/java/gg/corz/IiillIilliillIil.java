package gg.corz;

public record IiillIilliillIil(
   long feet, double eyeX, double eyeY, double eyeZ, boolean sneaking, long component, int reachableStands, Long surfaceCell, int tick
) {
   private final Long ililiIlIil;
   private final double lIiliIlIil;
   private final int lliliIlIil;
   private final double IIiliIlIil;
   private final double iilliIlIil;
   private final long IliliIlIil;
   public static final IiillIilliillIil liiliIlIil = new IiillIilliillIil(0L, 0.0, 0.0, 0.0, false, 0L, 0, null, -1);
   private final long lilliIlIil;
   private final boolean iIiliIlIil;
   private final int IiiliIlIil;

   public int IlIlllIlilIl() {
      return this.lliliIlIil;
   }

   public long IIIllIIliIIl() {
      return this.IliliIlIil;
   }

   public Long IiIlliIliiIl() {
      return this.ililiIlIil;
   }

   public double iIlIlllllill() {
      return this.iilliIlIil;
   }

   public double IilliliilIIi() {
      return this.IIiliIlIil;
   }

   public double lIiiIiIlilli() {
      return this.lIiliIlIil;
   }

   public int IliIlllilIi() {
      return llIiIiililIiIiil.IIlllIlliIll(this.lilliIlIil);
   }

   public long liiiIIllIl() {
      return this.lilliIlIil;
   }

   public IiillIilliillIil(long feet, double eyeX, double eyeY, double eyeZ, boolean sneaking, long component, int reachableStands, Long surfaceCell, int tick) {
      this.lilliIlIil = feet;
      this.iilliIlIil = eyeX;
      this.IIiliIlIil = eyeY;
      this.lIiliIlIil = eyeZ;
      this.iIiliIlIil = sneaking;
      this.IliliIlIil = component;
      this.lliliIlIil = reachableStands;
      this.ililiIlIil = surfaceCell;
      this.IiiliIlIil = tick;
   }

   public int IIlllIlliIll() {
      return this.IiiliIlIil;
   }

   public boolean iliIiiliiiii() {
      return this.iIiliIlIil;
   }
}
