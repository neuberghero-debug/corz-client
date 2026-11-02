package gg.corz;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import net.minecraft.class_2390;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_5819;
import org.joml.Matrix4f;

public class iiliiIiIIiiiIi extends ilIllIiIll {
   private final iIIlilIlIlIlilIl IlIlIliiillIlIliii;
   private final iliiliilIiiiliil iiIIIliiiIIlIIliii;
   private final IIIIlilllIIIlill lIlIIliiiiIlIIliii;
   private int liIlIliiiiiIlIliii;
   private double iIllIliiiIlllIliii;
   private final IIIIlilllIIIlill lliIIliiiiliIIliii;
   private final iiIiiilIIliiil illIIliiiIilIIliii;
   private final Deque<iIilIiIlilIi> lIIlIliiiiIIlIliii;
   private static final float IliiiIiiilliiiIiii = 0.45F;
   private final iiIiiilIIliiil iiiIIliiiIIIlIliii;
   private static final float lIiiiIiiiiIiiiIiii = 0.4F;
   private static final int IIIIIliiilIIIIliii = 40;
   private double iillIliiiIIilIliii;
   private final IIIIlilllIIIlill iIiIIliiiIliIIliii;
   private static final float iliiiIiiiIiiiiIiii = 10.0F;
   private final iiIiiilIIliiil lilIIliiiiilIIliii;
   private final iilliIlIIiliIl IIiIIliiilIiIIliii;
   private final IIIIlilllIIIlill IiiIIliiiliiIIliii;
   private final iiIiiilIIliiil IllIIliiilllIIliii;
   private final IIIIlilllIIIlill IiIIIliiiliIIIliii;
   private final lliliIIiililiIIi iIIIIliiiIlIIIliii = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","Ygr9vNcNEJXbKHOAx58agboBF4HJmGrpys9aVljn9yEW">(),
      IliIlllilIi<"IliIlllilIi","RnAwvYXv8DMrHZg0cStZ3sQ/Fr5T1VvHodI3o0DOm4w5MvORREt2LtZD9U62J2VGAjRwdugyEq+oDJ49p/p9c4fI">(),
      IliIlllilIi<"IliIlllilIi","Be7MoxSuKDL0HrQj7KSRpEG6O2WVf8Azak5ka6mZhKU=">(),
      IliIlllilIi<"IliIlllilIi","Be7MoxSuKDL0HrQj7KSRpEG6O2WVf8Azak5ka6mZhKU=">(),
      IliIlllilIi<"IliIlllilIi","JkRbfRDtz36/0nF1cCjNMivae/W+hlzrz+O97dI2rhRxewldKs4=">(),
      IliIlllilIi<"IliIlllilIi","trp98hUmi+6vJvmFidKZ/GuKkyIsG+R+p6miVKEQeaw=">()
   );
   private static final int liiiiIiiiiiiiiIiii = 16756958;
   private double llllIliiiilllIliii;
   private double IillIliiilillIliii;
   private boolean ilIlIliiiIiIlIliii;
   private final lliliIIiililiIIi llIIIliiiilIIIliii = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","i8XP78ElVXVVNWXA/GnXKayLv22foYTe3JdWWSbPMZf4Odk=">(),
      IliIlllilIi<"IliIlllilIi","ilj+5sTuyOPzkctd3PgWNU987fT38xXIV6Aecih3f7P7qjhF0CtWa5/1eaGnjt9e2LebuoO7nsV6CtfijphJgaOnF7zgJdE=">(),
      IliIlllilIi<"IliIlllilIi","NvhwYeV0rZmydxQNDYhXd6ydAqvwv9WjzTAu1xXv+gU=">(),
      IliIlllilIi<"IliIlllilIi","NvhwYeV0rZmydxQNDYhXd6ydAqvwv9WjzTAu1xXv+gU=">(),
      IliIlllilIi<"IliIlllilIi","xKBlpSj2PsrkS7QIcTt2vzm/4WO7ydaH8dLuqgW/I1E=">(),
      IliIlllilIi<"IliIlllilIi","trp98hUmi+6vJvmFidKZ/GuKkyIsG+R+p6miVKEQeaw=">()
   );
   private int IIllIliiilIllIliii;
   private static final float iiliiIiiiIIiiiIiii = 0.25F;

   private void lllllillll(Matrix4f matrix, iIilIiIlilIi life, long now, float baseRgb, float c, int sz) {
      float var8 = life.IliIlllilIi(now);
      float var9;
      float var10;
      if (var8 < 0.25F) {
         float var11 = var8 / 0.25F;
         var9 = llIililIil(var11);
         var10 = IIIillIIil(Math.min(1.0F, var11 * 2.0F));
      } else if (var8 > baseRgb - 0.4F) {
         float var15 = (var8 - (baseRgb - 0.4F)) / 0.4F;
         var9 = liilliiill(IIIillIIil(var15), 1.0F, 1.3F);
         var10 = 1.0F - iIIilIlIil(var15);
      } else {
         var9 = 1.0F;
         var10 = 1.0F;
      }

      float var16 = 0.5F + 0.5F * (float)Math.sin((double)(var8 * 10.0F));
      int var12 = Ilillllill(sz, 16756958, var16 * 0.35F);
      int var13 = lIilliIill(var12, var10 * (0.82F + 0.18F * var16));
      float var14 = 0.5F * c * var9;
      this.iilllIIill(matrix, life.IiillIIIlliillIIIl, life.iiillIIIlIIIilIIIl + (double)life.ilIilIIIlIiIilIIIl, life.lIIilIIIliIIilIIIl, var14, var13, 2.0F);
      this.iilllIIill(
         matrix,
         life.IiillIIIlliillIIIl,
         life.iiillIIIlIIIilIIIl + (double)life.ilIilIIIlIiIilIIIl,
         life.lIIilIIIliIIilIIIl,
         var14 * 0.6F,
         lIilliIill(var12, var10 * 0.4F * (0.82F + 0.18F * var16)),
         1.5F
      );
   }

   public iiliiIiIIiiiIi() {
      super(IliIlllilIi<"IliIlllilIi","c28u93+5D6G005TcTHb9547xzCPqj6p+YlibiDemO6zufqTNj44Oqg==">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IiIIIliiiliIIIliii = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","q01CcRcxapi00aN/VmnixrU10k5C+BJmRfIpZvJw33Y=">(),
         IliIlllilIi<"IliIlllilIi","2/75SroEhPmzkKgOyszLgVd3MGaEIJt2BP+v+Qs6ob35ByJdE+DNn1/Z6XzmeImO9Hd/hTFFcoAcQ0wSPQ==">(),
         1.0,
         0.5,
         3.0,
         0.1
      );
      this.iiIIIliiiIIlIIliii = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","enyofhiGeYpHRwFV56BFziQPQjyBBFPPYIgaSIhPTlsw">(),
         IliIlllilIi<"IliIlllilIi","TwXRMimTJ9o5rjkHMW/VEE/VVeKQp8FyNDz53HiSVGdBaqRGorRVsK2VV5U8JOmUstHo2QeB6Y9Eljg=">(),
         -5204993
      );
      this.lIlIIliiiiIlIIliii = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","Yut18cnzmpPKbHbFugNabiJE1YDbXshZTQM372QQx8Q0Ah5Z">(),
         IliIlllilIi<"IliIlllilIi","HNrdzRCX0yz5q7/bZpWeR0zWTsW7tdqY817ADrqoZDh67QprT/AoqrcjqmBmaxB7Sy2fEYzo0iAvbYdy2HF/anSKgQ==">(),
         1.5,
         0.5,
         4.0,
         0.1
      );
      this.IllIIliiilllIIliii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Z5GxoCtJiVEIKVofy1gQu0zn9UuUl+sYOOHikFbnJUh/I0c=">(),
         IliIlllilIi<"IliIlllilIi","s0sp7+WUzz1MYp6OLPvxESNOTgw2QmB/3Cg1aCi4fjWUy0Dn6zgUVzO8v57lPAukVYg58KA+6MHM/fgKtnl2Dw==">(),
         false
      );
      this.illIIliiiIilIIliii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","/vyqkf3RCe3/rJfEw6OKv9Z2AW0rVFoaogpb1tf6Non88BilJg==">(),
         IliIlllilIi<"IliIlllilIi","aMNwdfpr78sUI+v+BPbvcusfYwWdECrFxZI9lWg2pNH12ysSQmePvyVXZQhxfCqYV79a">(),
         true
      );
      this.lilIIliiiiilIIliii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","5M+f33qgK9rAEBgqcJNE5cVeDHOyZ/NAw0FfZwuckicGV0ECOw==">(),
         IliIlllilIi<"IliIlllilIi","aYbL49vjtk+QXALhJXL44VCUJvpi6kd5T3BY1EcBJqYd9zyIFS1R+ERoO2T3crPC2UcK9oac/UieXzQ86jySFfktUUTklMnTS8whTQ==">(),
         true
      );
      this.IIiIIliiilIiIIliii = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","YdU1YXxeDuCglPLxMvHqKbN2zsDbEiMItD7ovO4/hQ==">(),
         IliIlllilIi<"IliIlllilIi","iVv4+DqIfHsmqYOoGwEPB5Hc+zSnOMzILAlGEX/cme2+cvm8B98Ac9VkDsnhVCXxREV7WsWHSxbnlJ/0QeQpblsWtw6nBZtI5UPea+MUgtM=">(),
         10,
         1,
         30
      );
      this.iIiIIliiiIliIIliii = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","GkybvYPM/lYsgmgsKJ1M4gHee0eTZhc+RfO586MfqQXST3SjEMdN">(),
         IliIlllilIi<"IliIlllilIi","E+KJKTSkbsRDTrDZOzU1NqvAh3Vd3XVn4FZ7PWhYaP4JnRmQxHTRBacn81fX4wt5qRfQOWvqF8cCJRxE+LV7ASGliZWXg16yLOY=">(),
         0.45,
         0.1,
         1.0,
         0.05
      );
      this.lliIIliiiiliIIliii = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","pXJETbjXcukXg3gKQD30Dv1gM43IA9Tmx5TvljmGxqhhVWdLo/s=">(),
         IliIlllilIi<"IliIlllilIi","nXs3vwgn5mDvdqapbgTmo5lSp7dQtbqscGuJff4Bx3YFUZtX78fijFeYSbuoGWHV8/csNsJx0GGAiof2Xn2Ftsy8vzZOXuI9iZOtbHmGY9OqVw==">(),
         9.0,
         2.0,
         20.0,
         0.5
      );
      this.IiiIIliiiliiIIliii = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","nfHNBa4ePZeglpGlWM7pCgweF8GIKvGRGuExRY64TPkGBQ==">(),
         IliIlllilIi<"IliIlllilIi","JE22W8PipT6f/qN5tmdgnxhyXCWvcYxNfQfXvE///ScJurcuS+2Zc2XjK0J4iQynT1JVfvmOJrs7eg2RhiqUkNT4iA==">(),
         6.0,
         2.0,
         10.0,
         0.5
      );
      this.iiiIIliiiIIIlIliii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","rQEDLZE1bNvk/HyeXgknKP3/ADHVH6oGFANG2KQxQrMeghODyqw=">(),
         IliIlllilIi<"IliIlllilIi","aNtqWzTZKgqbPQEZyrj72/nppJmKoKlAGcv67Fj317fG7KDMG4ZWKjALZ2sbCff+hBAFEin+q+wMwXbgBLOJPYPcmj4RLEwzpiQiOY77">(),
         true
      );
      this.lIIlIliiiiIIlIliii = new ArrayDeque<>();
      this.IlIlIliiillIlIliii = new iIIlilIlIlIlilIl();
      this.ilIlIliiiIiIlIliii = true;
      this.iIllIliiiIlllIliii = Double.NaN;
      this.llllIliiiilllIliii = Double.NaN;
      this.IillIliiilillIliii = Double.NaN;
      this.iIiIIliiiIliIIliii.iIlIlllllill(IliIlllilIi<"IliIlllilIi","JkRbfRDtz36/0nF1cCjNMivae/W+hlzrz+O97dI2rhRxewldKs4=">());
      this.lliIIliiiiliIIliii.iIlIlllllill(IliIlllilIi<"IliIlllilIi","JkRbfRDtz36/0nF1cCjNMivae/W+hlzrz+O97dI2rhRxewldKs4=">());
      this.IiiIIliiiliiIIliii.iIlIlllllill(IliIlllilIi<"IliIlllilIi","JkRbfRDtz36/0nF1cCjNMivae/W+hlzrz+O97dI2rhRxewldKs4=">());
      this.iiiIIliiiIIIlIliii.iIlIlllllill(IliIlllilIi<"IliIlllilIi","JkRbfRDtz36/0nF1cCjNMivae/W+hlzrz+O97dI2rhRxewldKs4=">());
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.iIIIIliiiIlIIIliii,
            this.llIIIliiiilIIIliii,
            this.IiIIIliiiliIIIliii,
            this.iiIIIliiiIIlIIliii,
            this.lIlIIliiiiIlIIliii,
            this.IllIIliiilllIIliii,
            this.illIIliiiIilIIliii,
            this.lilIIliiiiilIIliii,
            this.IIiIIliiilIiIIliii,
            this.iIiIIliiiIliIIliii,
            this.lliIIliiiiliIIliii,
            this.IiiIIliiiliiIIliii,
            this.iiiIIliiiIIIlIliii
         }
      );
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (!this.IlIlIliiillIlIliii.IliIlllilIi()) {
            this.iIlllIllll(event, System.nanoTime());
         }

         if (!this.lIIlIliiiiIIlIliii.isEmpty()) {
            long var2 = System.nanoTime();
            float var4 = Math.max(0.1F, (float)this.lIlIIliiiiIlIIliii.Iilllilliill());
            Iterator var5 = this.lIIlIliiiiIIlIliii.iterator();

            while (var5.hasNext()) {
               if (((iIilIiIlilIi)var5.next()).IliIlllilIi(var2) > var4) {
                  var5.remove();
               }
            }

            if (!this.lIIlIliiiiIIlIliii.isEmpty()) {
               class_243 var12 = Iiiilllliiilll.field_1773.method_19418().method_71156();
               class_4587 var6 = event.IliiiIIilliiiIIi;
               var6.method_22903();
               var6.method_22904(-var12.field_1352, -var12.field_1351, -var12.field_1350);
               Matrix4f var7 = var6.method_23760().method_23761();
               float var8 = (float)this.IiIIIliiiliIIIliii.Iilllilliill();
               int var9 = this.IIllllIlll();

               for (iIilIiIlilIi var11 : this.lIIlIliiiiIIlIliii) {
                  this.lllllillll(var7, var11, var2, var4, var8, var9);
                  if (this.illIIliiiIilIIliii.Iilllilliill()) {
                     this.Iillllilll(var7, var11, var2, var8, var9);
                  }
               }

               var6.method_22909();
               iIiiIIilIliiIIil.IiIiliIiiiIi();
            }
         }
      }
   }

   private void ilIllIiIll() {
      int var1 = this.liIlliiIll();
      class_5819 var2 = Iiiilllliiilll.field_1724.method_59922();

      for (int var3 = 0; var3 < 10; var3++) {
         double var4 = var2.method_43058() * Math.PI * 2.0;
         double var6 = 0.15 + var2.method_43058() * 0.45;
         Iiiilllliiilll.field_1687
            .method_8406(
               new class_2390(var1, 0.9F),
               Iiiilllliiilll.field_1724.method_23317() + Math.cos(var4) * var6,
               Iiiilllliiilll.field_1724.method_23318() + 0.05,
               Iiiilllliiilll.field_1724.method_23321() + Math.sin(var4) * var6,
               0.0,
               0.6 + var2.method_43058() * 0.4,
               0.0
            );
      }
   }

   private int liIlliiIll() {
      return this.iiIIIliiiIIlIIliii.Iilllilliill() & (236219646 * -991146299 * 1056139499 * 1926714301 ^ 1258751093);
   }

   private static float llIililIil(float t) {
      t = ilillIiill(t);
      float var1 = 3.2F;
      float var2 = t - 1.0F;
      return 1.0F + var1 * var2 * var2 * var2 + 2.2F * var2 * var2;
   }

   private void iIlllIllll(illlllIillll event, long now) {
      if (Iiiilllliiilll.field_1687 != this.IlIlIliiillIlIliii.liiiIIllIl()) {
         this.IlIlIliiillIlIliii.iIlIlllllill();
      } else {
         class_243 var4 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         float var5 = (float)(System.currentTimeMillis() % 4000L) / 4000.0F;
         this.IlIlIliiillIlIliii
            .IlIlllIlilIl(
               event.IliiiIIilliiiIIi,
               var4,
               now,
               this.iIiIIliiiIliIIliii.Iilllilliill(),
               this.lliIIliiiiliIIliii.Iilllilliill(),
               this.iiiIlIIIll(),
               this.iiiIIliiiIIIlIliii.Iilllilliill(),
               this.liIlliiIll(),
               this.IllIIliiilllIIliii.Iilllilliill(),
               var5
            );
      }
   }

   private static float ilillIiill(float t) {
      return t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
   }

   private void lIIlliIIll(double waveGain) {
      String var3 = this.iIIIIliiiIlIIIliii.Iilllilliill();
      if (IiIiIilliIiIil.IliIlllilIi(var3)) {
         float var4 = 0.01F + (float)(this.IIllIliiilIllIliii % 8) * 0.001F;
         this.IIllIliiilIllIliii++;
         boolean var5 = IiIiIilliIiIil.IIIllIIliIIl(
            this.iIllIliiiIlllIliii,
            this.llllIliiiilllIliii,
            this.IillIliiilillIliii,
            Iiiilllliiilll.field_1724.method_23317(),
            Iiiilllliiilll.field_1724.method_23318(),
            Iiiilllliiilll.field_1724.method_23321()
         );
         this.lIIlIliiiiIIlIliii
            .addLast(
               new iIilIiIlilIi(
                  var5 ? this.iIllIliiiIlllIliii : Iiiilllliiilll.field_1724.method_23317(),
                  var5 ? this.llllIliiiilllIliii : Iiiilllliiilll.field_1724.method_23318(),
                  var5 ? this.IillIliiilillIliii : Iiiilllliiilll.field_1724.method_23321(),
                  Iiiilllliiilll.field_1724.method_36454(),
                  var4,
                  System.nanoTime()
               )
            );
         int var6 = Math.max(1, this.IIiIIliiilIiIIliii.Iilllilliill());

         while (this.lIIlIliiiiIIlIliii.size() > var6) {
            this.lIIlIliiiiIIlIliii.removeFirst();
         }
      }

      if (IiIiIilliIiIil.liiiIIllIl(var3)) {
         this.IlIllllIll(waveGain);
      }

      if (this.lilIIliiiiilIIliii.Iilllilliill()) {
         this.ilIllIiIll();
      }
   }

   private void Iillllilll(Matrix4f sz, iIilIiIlilIi matrix, long c, float baseRgb, int now) {
      float var7 = matrix.IliIlllilIi(c);
      if (!(var7 >= 0.45F)) {
         float var8 = var7 / 0.45F;
         float var9 = liilliiill(IIIillIIil(var8), 0.35F, 2.2F) * baseRgb;
         float var10 = 0.85F * (1.0F - iIIilIlIil(var8));
         this.iilllIIill(
            sz,
            matrix.IiillIIIlliillIIIl,
            matrix.iiillIIIlIIIilIIIl + (double)(matrix.ilIilIIIlIiIilIIIl * 0.5F) + 0.004,
            matrix.lIIilIIIliIIilIIIl,
            var9,
            lIilliIill(now, var10),
            1.5F
         );
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (!IiIiIilliIiIil.liiiIIllIl(this.iIIIIliiiIlIIIliii.Iilllilliill())) {
            if (!this.IlIlIliiillIlIliii.IliIlllilIi()) {
               this.IlIlIliiillIlIliii.iIlIlllllill();
            }
         } else {
            this.IlIlIliiillIlIliii.iliIiiliiiii(Iiiilllliiilll.field_1687, System.nanoTime(), this.lliIIliiiiliIIliii.Iilllilliill(), this.iiiIlIIIll());
         }

         boolean var1 = Iiiilllliiilll.field_1724.method_24828();
         double var2 = Iiiilllliiilll.field_1724.method_18798().field_1351;
         if (var1) {
            this.iIllIliiiIlllIliii = Iiiilllliiilll.field_1724.method_23317();
            this.llllIliiiilllIliii = Iiiilllliiilll.field_1724.method_23318();
            this.IillIliiilillIliii = Iiiilllliiilll.field_1724.method_23321();
         }

         boolean var4 = IiIiIilliIiIil.iIlIlllllill(this.ilIlIliiiIiIlIliii, var1, var2);
         boolean var5 = IiIiIilliIiIil.IilliliilIIi(this.ilIlIliiiIiIlIliii, var1, this.liIlIliiiiiIlIliii);
         double var6 = var5 ? IiIiIilliIiIil.iliIiiliiiii(this.iillIliiiIIilIliii) : 1.0;
         if (!var1) {
            this.iillIliiiIIilIliii = var2;
         }

         this.liIlIliiiiiIlIliii = var1 ? 0 : this.liIlIliiiiiIlIliii + 1;
         if (IiIiIilliIiIil.lIiiIiIlilli(this.llIIIliiiilIIIliii.Iilllilliill(), var4, var5)) {
            this.lIIlliIIll(var6);
         }

         this.ilIlIliiiIiIlIliii = var1;
      } else {
         this.IlIlIliiillIlIliii.iIlIlllllill();
      }
   }

   private static int lIilliIill(int alpha, float rgb) {
      long var3 = 8142859709677581898L;
      var3 ^= ((long)((int)(ilillIiill(rgb) * 255.0F)) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << (~(929729214 >>> 21 | 929729214 << 11) ^ -1414918564)
         | alpha & ((-496098534 - -115 << 23 | -496098534 - -115 >>> 9) ^ -972109586);
   }

   private double iiiIlIIIll() {
      return Math.max(Double.longBitsToDouble(2387098183216943936L ^ 2204851491531508442L), this.lIlIIliiiiIlIIliii.Iilllilliill());
   }

   private static float liilliiill(float t, float b, float a) {
      return b + (a - b) * t;
   }

   @Override
   protected void Iilililiiili() {
      this.lIIlIliiiiIIlIliii.clear();
      this.IlIlIliiillIlIliii.iIlIlllllill();
      this.ilIlIliiiIiIlIliii = true;
      this.liIlIliiiiiIlIliii = 0;
      this.iIllIliiiIlllIliii = this.llllIliiiilllIliii = this.IillIliiilillIliii = Double.longBitsToDouble(-7154009382335870922L ^ -2067193603220895690L);
      this.iillIliiiIIilIliii = 0.0;
   }

   private static float iIIilIlIil(float t) {
      t = ilillIiill(t);
      return t * t;
   }

   private int IIllllIlll() {
      if (this.IllIIliiilllIIliii.Iilllilliill()) {
         float var1 = (float)(System.currentTimeMillis() % (6047188196210982045L ^ 6047188196210979645L)) / 4000.0F;
         return class_3532.method_15369(var1, 0.75F, 1.0F) & (-35310168 - -75 - 75 ^ -48575913);
      } else {
         return this.liIlliiIll();
      }
   }

   private void IlIllllIll(double gain) {
      if (!Iiiilllliiilll.field_1724.method_7325()
         && !Iiiilllliiilll.field_1724.method_5799()
         && !Iiiilllliiilll.field_1724.method_5771()
         && !Iiiilllliiilll.field_1724.method_5765()) {
         if (IiIiIilliIiIil.IIIllIIliIIl(
            this.iIllIliiiIlllIliii,
            this.llllIliiiilllIliii,
            this.IillIliiilillIliii,
            Iiiilllliiilll.field_1724.method_23317(),
            Iiiilllliiilll.field_1724.method_23318(),
            Iiiilllliiilll.field_1724.method_23321()
         )) {
            this.IlIlIliiillIlIliii
               .IilliliilIIi(
                  Iiiilllliiilll.field_1687,
                  this.iIllIliiiIlllIliii,
                  this.llllIliiiilllIliii,
                  this.IillIliiilillIliii,
                  this.IiiIIliiiliiIIliii.Iilllilliill(),
                  this.IIiIIliiilIiIIliii.Iilllilliill(),
                  gain,
                  System.nanoTime()
               );
         }
      }
   }

   private void iilllIIill(Matrix4f cx, double cz, double radius, double argb, float matrix, int width, float cy) {
      float var11 = 0.0F;
      float var12 = 0.0F;

      for (int var13 = 0; var13 <= 40; var13++) {
         double var14 = (double)var13 / 40.0 * Math.PI * 2.0;
         float var16 = (float)(cz + Math.cos(var14) * (double)matrix);
         float var17 = (float)(argb + Math.sin(var14) * (double)matrix);
         if (var13 > 0) {
            iIiiIIilIliiIIil.Iliilliiilii(cx, var11, (float)radius, var12, var16, (float)radius, var17, width, cy);
         }

         var11 = var16;
         var12 = var17;
      }
   }

   private static float IIIillIIil(float t) {
      t = ilillIiill(t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private static int Ilillllill(int to, int t, float from) {
      long var6 = 2290307959482495916L;
      long var8 = -3363837482726520411L;
      var6 ^= (
            (long)(
                     (int)liilliiill(
                        from,
                        (float)(to >> ((-1523541453 << 15 | -1523541453 >>> 17) - 31 ^ 1293537897) & (-(~(-959185263)) ^ -959185299)),
                        (float)(
                           t
                                 >> (
                                    (
                                          ((2110163154 << 27 | 2110163154 >>> 5) >>> 21 | (2110163154 << 27 | 2110163154 >>> 5) << 11) * -95 >>> 27
                                             | ((2110163154 << 27 | 2110163154 >>> 5) >>> 21 | (2110163154 << 27 | 2110163154 >>> 5) << 11) * -95 << 5
                                       )
                                       ^ -1714479126
                                 )
                              & ((-(-975754259 - 99) >>> 23 | -(-975754259 - 99) << 9) ^ 1370025099)
                        )
                     )
                  )
                  << 32
               ^ var6
         )
         & -1L << 32;
      var6 ^= (
            (long)(
                  (int)liilliiill(
                     from,
                     (float)(to >> ((-342519634 * 7 << 9 | -342519634 * 7 >>> 23) + 67 - 77 ^ 770278608) & ((1738334463 * 3 + 25) * 43 ^ -31 ^ -906847316)),
                     (float)(t >> ((89917381 << 1 | 89917381 >>> 31) ^ 99 ^ 109 ^ -95 ^ -179834835) & (-1873518065 + -97 - 117 + -87 ^ -1873518563))
                  )
               )
               ^ var6
         )
         & -1L >>> 32;
      var8 ^= (
            (long)(
                     (int)liilliiill(
                        from,
                        (float)(to & ((1092874734 - -45 << 19 | 1092874734 - -45 >>> 13) * 1594008481 ^ -2144568960)),
                        (float)(t & (~((-857026813 - -19) * 63) ^ -1841886870))
                     )
                  )
                  << 32
               ^ var8
         )
         & -1L << 32;
      return (int)(var6 >>> 32) << (~(-1014966314 - -89) ^ -55 ^ -1014966263) | (int)var6 << ((-511582304 - -41) * -107 ^ -1095272715) | (int)(var8 >>> 32);
   }
}
