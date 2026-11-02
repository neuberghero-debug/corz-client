package gg.corz;

public record lIlIilIiiIlIilIi(
   float ehp, boolean totem, float fallEpf, int resistanceAmp, boolean fireResistant, int food, boolean usingItem, int pingMs, int style
) {
   private final float IIIiiIlIIi;
   private final boolean iIIiiIlIIi;
   private final boolean llIiiIlIIi;
   private final boolean iiiliIlIIi;
   private final int IlIiiIlIIi;
   private final int lIIiiIlIIi;
   private final int IiIiiIlIIi;
   private final int ilIiiIlIIi;
   public static final lIlIilIiiIlIilIi liIiiIlIIi = new lIlIilIiiIlIilIi(20.0F, false, 0.0F, -1, false, 20, false, 0, 0);
   private final float liiliIlIIi;

   public boolean lIiiIiIlilli() {
      return this.iIIiiIlIIi;
   }

   public int iliIiiliiiii() {
      return this.IlIiiIlIIi;
   }

   public float IliIlllilIi() {
      return this.liiliIlIIi;
   }

   public float iIlIlllllill() {
      return this.IIIiiIlIIi;
   }

   public boolean liiiIIllIl() {
      return this.iiiliIlIIi;
   }

   public int IilliliilIIi() {
      return this.lIIiiIlIIi;
   }

   public int IlIlllIlilIl() {
      return this.ilIiiIlIIi;
   }

   public int IiIlliIliiIl() {
      return this.IiIiiIlIIi;
   }

   public boolean IIIllIIliIIl() {
      return this.llIiiIlIIi;
   }

   public lIlIilIiiIlIilIi(
      float ehp, boolean totem, float fallEpf, int resistanceAmp, boolean fireResistant, int food, boolean usingItem, int pingMs, int style
   ) {
      this.liiliIlIIi = ehp;
      this.iiiliIlIIi = totem;
      this.IIIiiIlIIi = fallEpf;
      this.lIIiiIlIIi = resistanceAmp;
      this.iIIiiIlIIi = fireResistant;
      this.IlIiiIlIIi = food;
      this.llIiiIlIIi = usingItem;
      this.ilIiiIlIIi = pingMs;
      this.IiIiiIlIIi = style;
   }
}
