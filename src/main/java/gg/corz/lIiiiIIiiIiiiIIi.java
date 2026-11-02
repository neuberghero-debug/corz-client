package gg.corz;

import net.minecraft.class_10185;
import net.minecraft.class_1656;
import net.minecraft.class_746;

public class lIiiiIIiiIiiiIIi extends ilIllIiIll {
   private float liilliiiil;
   private final IIIIlilllIIIlill ililliiiil;
   private static final float iIilliiiil = 0.05F;
   private final IIIIlilllIIIlill llilliiiil;
   private boolean Iiilliiiil;
   private final lliliIIiililiIIi Ililliiiil = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","ImOGNk2qP4sAO8YcyOKHfaBnFodOWPjJef7ES46eyZE=">(),
      IliIlllilIi<"IliIlllilIi","8JIGr1OJ8MJwF5yCtmD4C6LACsfhMg2+6sghR4+lKRSgHaz8CWH3GJmfAzAV5JDdSLTFSzFHJEQBVdWM+Yuq5+pfhB8Xac7ugmPKvnr0A3T2NDzAtaV2K5A2eW8F5uXWjoIIEshlIhs5yHwi0doPixFdADq23F+KjYn5bKku2WeAXcpln7t00cmFTM9idkQNtIuD5DyzWpqDl99Kkga0Rq3bCHz67JIGeaW6jdxCiUdEPkvOZWWPUrccoQ==">(),
      IliIlllilIi<"IliIlllilIi","jd3Bb4+JLj6LnKr4bZ4OI7ly7D/rTAp5cIQutYd4YAIRW4K9">(),
      IliIlllilIi<"IliIlllilIi","jd3Bb4+JLj6LnKr4bZ4OI7ly7D/rTAp5cIQutYd4YAIRW4K9">(),
      IliIlllilIi<"IliIlllilIi","bU3mUtiMH4V2mwG4Bw9BTWnBr9CZAJbToJEmx/aftf7evVP6">()
   );

   @Override
   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null) {
         class_1656 var2 = var1.method_31549();
         if (this.iiiIlIIIll()) {
            if (!this.Iiilliiiil) {
               this.liilliiiil = var2.method_7252();
               this.Iiilliiiil = true;
            }

            var2.field_7478 = true;
            var2.field_7479 = true;
            var2.method_7248((float)(0.05F * this.llilliiiil.Iilllilliill()));
         } else {
            this.IlIllllIll(var2);
         }

         var1.field_6017 = 0.0;
      }
   }

   public lIiiiIIiiIiiiIIi() {
      super(IliIlllilIi<"IliIlllilIi","463UTrF/7GIMkUVpEnUhjwt9RC3hHrRnJX97kmEQo09Z3g==">(), lllIllillIll.IIIlIIIilIIlIIIi);
      this.llilliiiil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","05JtiXjk/AmFRaILlcmPkC8IEmUsZThaGFdCuXHqHgcg">(),
         IliIlllilIi<"IliIlllilIi","JW7D0IjDLfEf3o2DtadPHZ4yAdvSCv/EJE5zlX/MB8s2aSoioF+nBDvwUBIEROmhVyeWff69OOH9YbFxBtkAcn9FbqMiHi1kIup13rQjbaANzUPIv3xAqdclU7hy59Mzkc0E3gUfagdmG6IhRL6F7jwDEJHRCNtZsl1O">(),
         0.8,
         0.1,
         5.0,
         0.05
      );
      this.ililliiiil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","s3mVnoA1JXq8ZswjntiX4ra7vMoxE9vgvEua5ea2aA2ckhWZAN2wx6lR">(),
         IliIlllilIi<"IliIlllilIi","3AyNJ88C1tOVPFsEHBF+BYO5dBI4Mer5cgc3h3IChwvV2SZi08cOjdvc808Os7LhKQY92dZ21nHlumWwTcSLimeqvpzZtPv+95Q+JQgZGgT0+w==">(),
         0.5,
         0.1,
         5.0,
         0.05
      );
      this.Iiilliiiil = false;
      this.liilliiiil = 0.05F;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.Ililliiiil, this.llilliiiil, this.ililliiiil});
   }

   @Override
   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1724 != null) {
         this.IlIllllIll(Iiiilllliiilll.field_1724.method_31549());
      }
   }

   private void IlIllllIll(class_1656 ab) {
      if (this.Iiilliiiil) {
         ab.method_7248(this.liilliiiil);
         if (!ab.field_7477) {
            ab.field_7478 = false;
            ab.field_7479 = false;
         }

         this.Iiilliiiil = false;
      }
   }

   private boolean iiiIlIIIll() {
      return IliIlllilIi<"IliIlllilIi","bU3mUtiMH4V2mwG4Bw9BTWnBr9CZAJbToJEmx/aftf7evVP6">().equals(this.Ililliiiil.Iilllilliill());
   }

   public boolean lIIlliIIll(class_746 p) {
      if (this.iiiIlIIIll()) {
         return false;
      } else if (p.method_5765()) {
         return false;
      } else {
         class_10185 var2 = p.field_3913.field_54155;
         double var3 = (var2.comp_3159() ? 1.0 : 0.0) - (var2.comp_3160() ? 1.0 : 0.0);
         double var5 = (var2.comp_3161() ? 1.0 : 0.0) - (var2.comp_3162() ? 1.0 : 0.0);
         double[] var7 = IilIililIi.IliIlllilIi(var5, var3, this.llilliiiil.Iilllilliill(), p.method_36454());
         double var8 = 0.0;
         boolean var10 = Iiiilllliiilll.field_1690.field_1903.method_1434();
         boolean var11 = Iiiilllliiilll.field_1690.field_1832.method_1434();
         if (var10 != var11) {
            var8 = var10 ? this.ililliiiil.Iilllilliill() : -this.ililliiiil.Iilllilliill();
         }

         p.method_18800(var7[0], var8, var7[1]);
         return true;
      }
   }
}
