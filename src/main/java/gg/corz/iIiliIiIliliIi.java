package gg.corz;

import net.minecraft.class_243;

public class iIiliIiIliliIi extends ilIllIiIll {
   private final iiIiiilIIliiil lilIiiliiiilIiilii;
   private static final double IiIIiiliiliIIiilii = 12.0;
   private double iIiIiiliiIliIiilii;
   private final IIIIlilllIIIlill IIiIiiliilIiIiilii;
   private final IIIIlilllIIIlill lIlIiiliiiIlIiilii = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","NONzSt2XLZP5CanO+dxY7SKdJwFD0XTcUFKy+iPMTQ==">(),
      IliIlllilIi<"IliIlllilIi","REmVTQr6CeDAjP9C1s6FslTqJ7kky49/fsmczIPNVbMwVLNxA2atc7qoXYRsD0B8">(),
      95.0,
      30.0,
      140.0,
      1.0
   );
   private final iiIiiilIIliiil illIiiliiIilIiilii;
   private final iiIiiilIIliiil IllIiiliilllIiilii = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","jhxuCn8y0Z+Gx9GJFU6bS32fBHdASDqUTA/2beVYK/B6cw==">(),
      IliIlllilIi<"IliIlllilIi","W15UtDKOfHSPVvI17E0AtpalpIXayEb/sRgcHlwFneQIvbq/Jz+ZnES2leKonJLC1AmF4q+ETQ==">(),
      true
   );
   private long lliIiiliiiliIiilii;
   private static final double iiIIiiliiIIlIiilii = 0.2825;

   private double lIIlliIIll() {
      if (this.lilIiiliiiilIiilii.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         class_243 var1 = Iiiilllliiilll.field_1724.method_18798();
         double var2 = Math.sqrt(var1.field_1352 * var1.field_1352 + var1.field_1350 * var1.field_1350);
         double var4 = Math.min(1.0, var2 / Double.longBitsToDouble(658330603547529365L ^ 3958884287385681537L));
         return this.IIiIiiliilIiIiilii.Iilllilliill() * var4;
      } else {
         return 0.0;
      }
   }

   public iIiliIiIliliIi() {
      super(IliIlllilIi<"IliIlllilIi","EA6Y/18GQ4C8/KtD0fHE22Y3vf2GlS2sFK3m8nh7Tn+GdqOKpQ==">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.illIiiliiIilIiilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","WnFnuye9jGdoO1Tnf66nYkch6GHB8h3wRUmVU0RvIaEIlFw+y4UuQxbY">(),
         IliIlllilIi<"IliIlllilIi","jsHiL6M2YralR4q15L2e3XENk+ylRwQXooR0AE/ankwoJYYtRZU3lys+MStCbweshsT0KZjc4HsQowLjCyIQJcpm6wfbY3U=">(),
         true
      );
      this.lilIiiliiiilIiilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","tUq0mjQFzh7uRFWPezDU0hgNqU9txAMSEYbiY3xCEgQzJa0qow==">(),
         IliIlllilIi<"IliIlllilIi","d1+pcW/O9T2MM4IxlTg043gt6kbQPgCja2dhVHkPsVgr9vcDtzrt+JSXNptaxgJA/wWHdlaiSxJwmgfAV6HrHIuuBg==">(),
         false
      );
      this.IIiIiiliilIiIiilii = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","Gb2IvilRnamqOVit0+KhCFUSHrmS8/AOqV/2gNI7zJh5Xa/dXdWUWMrm">(),
         IliIlllilIi<"IliIlllilIi","MpnabT9sTtEcNbUcUSSCm3dkMJnU6GQTbNsnBjPl/kf4oXEgng0dry5HLfHUBn39aJaWOEkeW7I=">(),
         12.0,
         0.0,
         30.0,
         1.0
      );
      this.iIiIiiliiIliIiilii = -1.0;
      this.lliIiiliiiliIiilii = 0L;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{this.lIlIiiliiiIlIiilii, this.IllIiiliilllIiilii, this.illIiiliiIilIiilii, this.lilIiiliiiilIiilii, this.IIiIiiliilIiIiilii}
      );
   }

   public float iiiIlIIIll(float original) {
      long var11 = 1236617332118632834L;
      var11 ^= ((long)((Integer)Iiiilllliiilll.field_1690.method_41808().method_41753()).intValue() << 32 ^ var11) & -1L << 32;
      if ((int)(var11 >>> 32) <= 0) {
         return original;
      } else {
         double var3 = this.lIlIiiliiiIlIiilii.Iilllilliill() + this.lIIlliIIll();
         long var5 = System.nanoTime();
         double var7 = this.lliIiiliiiliIiilii == (4268714930647133255L ^ 4268714930647133255L)
            ? 0.0
            : (double)(var5 - this.lliIiiliiiliIiilii) / Double.longBitsToDouble(-5574165264861863519L ^ -907093396884659807L);
         this.lliIiiliiiliIiilii = var5;
         if (this.iIiIiiliiIliIiilii < Double.longBitsToDouble(4036871790820170980L ^ 4036871790820170980L)) {
            this.iIiIiiliiIliIiilii = (double)((int)(var11 >>> 32));
         }

         if (!this.IllIiiliilllIiilii.Iilllilliill()) {
            this.iIiIiiliiIliIiilii = var3;
         } else {
            double var9 = 1.0 - Math.exp(Double.longBitsToDouble(5483985486877980678L ^ -8344317168963127290L) * Math.max(0.0, var7));
            this.iIiIiiliiIliIiilii = this.iIiIiiliiIliIiilii + (var3 - this.iIiIiiliiIliIiilii) * var9;
            if (Math.abs(this.iIiIiiliiIliIiilii - var3) < Double.longBitsToDouble(8503180806833345221L ^ 5307708205321751391L)) {
               this.iIiIiiliiIliIiilii = var3;
            }
         }

         if (this.illIiiliiIilIiilii.Iilllilliill()) {
            return (float)this.iIiIiiliiIliIiilii;
         } else {
            double var13 = (double)original / (double)((int)(var11 >>> 32));
            return (float)(this.iIiIiiliiIliIiilii * var13);
         }
      }
   }
}
