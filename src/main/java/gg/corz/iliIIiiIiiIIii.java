package gg.corz;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_412;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_500;
import net.minecraft.class_638;
import net.minecraft.class_639;
import net.minecraft.class_642;

public class iliIIiiIiiIIii extends ilIllIiIll {
   private static long llIiillIIl;
   private class_2535 liIiillIIl;
   private long iiIiillIIl;
   private IIiIIllllIiIIlll ilIiillIIl;
   private int IIliillIIl;
   private final iilliIlIIiliIl IlIiillIIl = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","HV0qhU803e2foi7YwSIzhMrVimzFogUPoGrLMG8qqcY=">(),
      IliIlllilIi<"IliIlllilIi","4R9PNSAUYPez4SijdqBpPSLVOVmKpvLM+91lka+9NJYe7ViNFQ8e38AjwgJH+bHgIvjYZ3XpcR+K5G16JzAMDvD7g2QVZR4Po7xNAPrCjkxiRZ02uhetBII/d49U19EhZz5HvyzMhgxtCqaQ0G24YoVhQn0WhAUGj9UMOLSwwcmwvijNeOM=">(),
      0,
      0,
      (-459298961 >>> 21 | -459298961 << 11) ^ 31 ^ -46432463
   );
   private class_642 IiIiillIIl;

   public iliIIiiIiiIIii() {
      super(IliIlllilIi<"IliIlllilIi","6aE2gBe3WcIgipY5dtJkvC1hrg6vrqogvX8swcWw4MfQ/2OYapYXNQ==">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlIiillIIl});
   }

   @Override
   protected void Iilililiiili() {
      this.IIliillIIl++;
      this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
      this.IiIiillIIl = null;
      this.liIiillIIl = null;
   }

   private void ilIllIiIll(String msg, boolean good) {
      this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
      if (this.IliIlllilIi()) {
         try (AutoCloseable var3 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
            this.IIillIiliIil(false);
         } catch (Exception var8) {
            this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
         }
      }

      if (msg != null) {
         this.liIlliiIll(msg, good);
      }
   }

   private void liIlliiIll(String good, boolean msg) {
      if (!IliiliIllliiliIl.iiiIlIIIll()) {
         if (Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724
               .method_7353(class_2561.method_43470(IliIlllilIi<"IliIlllilIi","trhjzoG/VpApa4mGdd+5un5kMcLDrO+1QEAA6x+PiNtWNA+SR4umx+vM">() + good), false);
         }
      } else {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","6aE2gBe3WcIgipY5dtJkvC1hrg6vrqogvX8swcWw4MfQ/2OYapYXNQ==">(), good, msg);
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (this.ilIiillIIl == IIiIIllllIiIIlll.iilIIIIill && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.method_1562() != null) {
         if (Iiiilllliiilll.method_1562().method_48296() != this.liIiillIIl) {
            class_642 var1 = Iiiilllliiilll.method_1558();
            long var2 = System.currentTimeMillis() - this.iiIiillIIl;
            String var4 = this.IiIiillIIl == null ? null : this.IiIiillIIl.field_3761;
            if (IIlIlIillIlIlIil.lIiiIiIlilli(var4, var1 == null ? null : var1.field_3761, var2)) {
               this.ilIllIiIll(
                  IliIlllilIi<"IliIlllilIi","wOjUUbE3o/zdQzHb9cgj+/96yArPPAGL6ZHve8ssXzQKoVJcLyAhn/v/">()
                     + IlIllllIll(this.IiIiillIIl)
                     + IliIlllilIi<"IliIlllilIi","/ufinr49e9IdT+98nUnJ1LoV0FL04gVMbdyVU3Q=">(),
                  true
               );
            } else {
               this.ilIllIiIll(null, false);
            }
         }
      }
   }

   private void iiiIlIIIll(int t) {
      if (t == this.IIliillIIl && this.ilIiillIIl == IIiIIllllIiIIlll.lilIIIIill && this.IliIlllilIi() && this.IiIiillIIl != null) {
         if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null && Iiiilllliiilll.method_1562().method_48296() == this.liIiillIIl) {
            this.ilIiillIIl = IIiIIllllIiIIlll.iilIIIIill;
            Iiiilllliiilll.method_73360(class_638.field_61021);
            class_500 var2 = Iiiilllliiilll.field_1755 instanceof class_500 var3 ? var3 : new class_500(new class_442());
            long var6 = IIlIlIillIlIlIil.iIlIlllllill(this.IlIiillIIl.Iilllilliill());
            if (var6 <= (3115445281409273701L ^ 3115445281409273701L)) {
               this.lIIlliIIll(t, var2, null);
            } else {
               if (Iiiilllliiilll.field_1755 != var2) {
                  Iiiilllliiilll.method_1507(var2);
               }

               class_437 var5 = Iiiilllliiilll.field_1755;
               CompletableFuture.delayedExecutor(var6, TimeUnit.MILLISECONDS).execute(() -> Iiiilllliiilll.execute(() -> this.lIIlliIIll(t, var2, var5)));
            }
         } else {
            this.ilIllIiIll(null, false);
         }
      }
   }

   private void lIIlliIIll(int t, class_437 expect, class_437 back) {
      if (t == this.IIliillIIl && this.ilIiillIIl == IIiIIllllIiIIlll.iilIIIIill && this.IliIlllilIi() && this.IiIiillIIl != null) {
         if (Iiiilllliiilll.field_1687 == null && (back == null || Iiiilllliiilll.field_1755 == back)) {
            class_412.method_36877(expect, Iiiilllliiilll, class_639.method_2950(this.IiIiillIIl.field_3761), this.IiIiillIIl, false, null);
         } else {
            this.ilIllIiIll(null, false);
         }
      }
   }

   private static String IlIllllIll(class_642 info) {
      if (info == null) {
         return IliIlllilIi<"IliIlllilIi","Kxrfsfd2UqBfKeoOSjzo/RScxWcCUfHW3RW6H38UWdi6Loh7IO4=">();
      } else {
         return info.field_3752 != null && !info.field_3752.isBlank() ? info.field_3752 : info.field_3761;
      }
   }

   @Override
   protected void Illillliilli() {
      long var8 = 7993811135103125443L;
      if (Iiiilllliiilll != null) {
         var8 ^= ((long)(++this.IIliillIIl) << 32 ^ var8) & -1L << 32;
         this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
         this.IiIiillIIl = null;
         this.liIiillIIl = null;
         long var2 = System.currentTimeMillis();
         var8 ^= ((long)(Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null ? 1 : 0) ^ var8)
            & -1L >>> 32;
         class_642 var5 = (int)var8 != 0 ? Iiiilllliiilll.method_1558() : null;
         ilIIiIllIiIIiIll var6 = IIlIlIillIlIlIil.IliIlllilIi(
            (boolean)((int)var8), Iiiilllliiilll.method_1542(), var5 == null ? null : var5.field_3761, var5 != null && var5.method_52811(), var2, llIiillIIl
         );
         if (var6 != ilIIiIllIiIIiIll.IIIillilll) {
            String var7 = IIlIlIillIlIlIil.liiiIIllIl(var6);
            Iiiilllliiilll.method_63588(() -> {
               if (msg == this.IIliillIIl) {
                  this.ilIllIiIll(var7, false);
               }
            });
         } else {
            llIiillIIl = var2;
            this.IiIiillIIl = var5;
            this.liIiillIIl = Iiiilllliiilll.method_1562().method_48296();
            this.iiIiillIIl = var2;
            this.ilIiillIIl = IIiIIllllIiIIlll.lilIIIIill;
            Iiiilllliiilll.method_63588(() -> this.iiiIlIIIll(t));
         }
      }
   }
}
