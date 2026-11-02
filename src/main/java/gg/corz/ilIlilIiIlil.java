package gg.corz;

public class ilIlilIiIlil extends ilIllIiIll {
   private static final float Illlillillllilli = 2.2222222E-9F;
   private long IlIiillillIiilli;
   private static ilIlilIiIlil Iiililliliililli;
   private float IIliillilIliilli;
   private float iIliilliIlliilli;
   private static final double illlilliIillilli = 0.16;
   private float ilIiilliIiIiilli;
   private final iilliIlIIiliIl lillilliiillilli = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","EcBmxDyrl39PJ/6SCY95OPtBxoDmhFA9BA8M9a981WVva3PhScho">(),
      IliIlllilIi<"IliIlllilIi","GEqv/BxYiE/SHfzc3xwuZ7YsvKw6vm7M2mfutcAf722FDKA+KcX9wH5m8D9LLIEynhND1KB40KF/PgiOBPF++0jlGvZ+9fW4dH3ZBUPlW/j3aK0MY8jwhjwqKw==">(),
      70,
      0,
      100
   );
   private final iiIiiilIIliiil IIilillilIililli = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","jAaS0oPMuqwoMSJ+Aise21dRPsr59fxl2daDJA0qlz0mdQUvnN3Lfq3z/Trhpw==">(),
      IliIlllilIi<"IliIlllilIi","hjBkmj5f5kQmbnh7fhkRftqdWrL9/MnjkF65kNjzfrWoxrbcybeyw9o72KnK8eiMFNUKqW2CrUaL5ewBS/kQI3he1txc4JsRYHAtXhOPQ9UBOTzc0yxwF2wF8QXiZQjIWtVW4peLzzsF6/3BIgh8ji+A7dx+xn18De9RfDU=">(),
      true
   );
   private float iiililliIIIiilli;
   private final iilliIlIIiliIl llililliilililli;
   private long lIIiilliiIIiilli;
   private final iilliIlIIiliIl iIililliIlililli = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","ppDJr+P7t/JyudkvIOwA77j+iRccqE4RDSK2cy/ICgqp">(),
      IliIlllilIi<"IliIlllilIi","noioTH+Q1cB8B0AORkq5BBRRQR9H+MoTbrmG3rulY2YRUmlnsB2YjPOgjRbrd6TDEZwACQhEimgoEeGy4nvEnYAQcbLR9qyp">(),
      55,
      0,
      100
   );
   private float liIiilliiiIiilli;

   public static ilIlilIiIlil iiiIlIIIll() {
      ilIlilIiIlil var0 = Iiililliliililli;
      return var0 != null ? var0 : (ilIlilIiIlil)llilIllililIll.iliIiiliiiii(ilIlilIiIlil.class);
   }

   public void IlIllllIll(long now) {
      float var3 = (float)this.lillilliiillilli.Iilllilliill() / 100.0F;
      float var4 = (float)this.iIililliIlililli.Iilllilliill() / 100.0F;
      float var5 = (float)this.llililliilililli.Iilllilliill() / 100.0F;
      IiIliIllliIliIll var6 = IiIliIllliIliIll.iiiIlIIIll();
      float var7 = this.IIilillilIililli.Iilllilliill() && var6 != null ? var6.lIIlliIIll() : 0.0F;
      if (!(this.ilIiilliIiIiilli < 0.0F) && this.IlIiillillIiilli >= 0L) {
         double var8 = Math.max(0.0, Math.min((double)(now - this.IlIiillillIiilli) / 1.0E9, 0.25));
         this.IlIiillillIiilli = now;
         float var10 = (float)(1.0 - Math.exp(-var8 / 0.16));
         this.ilIiilliIiIiilli = this.ilIiilliIiIiilli + (var3 - this.ilIiilliIiIiilli) * var10;
         this.liIiilliiiIiilli = this.liIiilliiiIiilli + (var4 - this.liIiilliiiIiilli) * var10;
         this.IIliillilIliilli = this.IIliillilIliilli + (var5 - this.IIliillilIliilli) * var10;
         this.iIliilliIlliilli = this.iIliilliIlliilli + (var7 - this.iIliilliIlliilli) * var10;
         if (Math.abs(var7 - this.iIliilliIlliilli) < 0.002F) {
            this.iIliilliIlliilli = var7;
         }
      } else {
         this.ilIiilliIiIiilli = var3;
         this.liIiilliiiIiilli = var4;
         this.IIliillilIliilli = var5;
         this.iIliilliIlliilli = var7;
         this.IlIiillillIiilli = now;
      }
   }

   @Override
   public void Iilililiiili() {
      this.lIIiilliiIIiilli = System.nanoTime();
   }

   @Override
   public void Illillliilli() {
      this.lIIiilliiIIiilli = System.nanoTime();
   }

   public float liIlliiIll() {
      return this.liIiilliiiIiilli;
   }

   public float lIIlliIIll(long now) {
      long var7 = 7031783988989714037L;
      if (this.lIIiilliiIIiilli < (-7287795307340467508L ^ -7287795307340467508L)) {
         this.lIIiilliiIIiilli = now;
      }

      long var3 = Math.max(0L, Math.min(now - this.lIIiilliiIIiilli, 4918461392616817409L ^ 4918461392719229313L));
      this.lIIiilliiIIiilli = now;
      var7 ^= (
            (long)(this.IliIlllilIi() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && !iiliiIllIIiiiIll.liiiIIllIl() ? 1 : 0)
                  << 32
               ^ var7
         )
         & -1L << 32;
      float var6 = (float)var3 * 2.2222222E-9F;
      this.iiililliIIIiilli = (int)(var7 >>> 32) != 0 ? Math.min(1.0F, this.iiililliIIIiilli + var6) : Math.max(0.0F, this.iiililliIIIiilli - var6);
      return this.iiililliIIIiilli * this.iiililliIIIiilli * (3.0F - 2.0F * this.iiililliIIIiilli);
   }

   public float ilIllIiIll() {
      return Math.max(0.0F, this.ilIiilliIiIiilli);
   }

   public float IIllllIlll() {
      return this.IIliillilIliilli;
   }

   @Override
   protected void iIIIlIlIIl() {
      iiliiIllIIiiiIll.IilliliilIIi(Iiiilllliiilll);
   }

   public float iIlllIllll() {
      return this.iIliilliIlliilli;
   }

   public ilIlilIiIlil() {
      super(IliIlllilIi<"IliIlllilIi","OHciOERQSru6kkQMdQzuXTksjhTDknWkYr7ske2dq+BPSpnpZzjrxl3Muw==">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.llililliilililli = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","BMqLVXi/NXEv8xDVU5rqk4ndBsakA13cUiMYVScVaG4QXHc=">(),
         IliIlllilIi<"IliIlllilIi","kRtL5oQFTMEr2DGbQJ4+sWnQI23hF5oJbUixoLb4YgIc1VJTsdRI3KX5fjADaD6/9BSjxBrXIqSTt1Uk9hG9KXoECBoukYH7Q0bBTNm+qOpyQs9JWA2/g/kz">(),
         70,
         0,
         100
      );
      this.lIIiilliiIIiilli = -1L;
      this.IlIiillillIiilli = -1L;
      this.ilIiilliIiIiilli = -1.0F;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lillilliiillilli, this.IIilillilIililli, this.iIililliIlililli, this.llililliilililli});
      Iiililliliililli = this;
      iiliiIllIIiiiIll.IliIlllilIi();
   }
}
