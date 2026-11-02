package gg.corz;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_4587;
import net.minecraft.class_638;

public class IiiiIlIiliiiIlIi extends ilIllIiIll {
   private int lillIlIIIi;
   private int illlIlIIIi;
   private int llIlIlIIIi;
   private final List<class_2338> IiIlIlIIIi;
   private int IIilIlIIIi;
   private static final int ilIlIlIIIi = 12;
   private int IIllIlIIIi;
   private final iilliIlIIiliIl IiiIIlIIIi;
   private int iIllIlIIIi;
   private int IlllIlIIIi;
   private int IillIlIIIi;
   private final iilliIlIIiliIl iiiIIlIIIi;
   private int lIllIlIIIi;
   private static final int lliIIlIIIi = 6000;
   private int iillIlIIIi;
   private final iilliIlIIiliIl liiIIlIIIi;
   private final iilliIlIIiliIl IIIlIlIIIi;
   private int iIilIlIIIi;
   private boolean liIlIlIIIi;
   private static final int IliIIlIIIi = 8;
   private final IIIlIlIllIIlIlIl iliIIlIIIi = new IIIlIlIllIIlIlIl(
      IliIlllilIi<"IliIlllilIi","+DLhlz+zQMChqCO+Ox1TVRCHbrSOGQhw80lN6PIXwVO3Xw==">(),
      IliIlllilIi<"IliIlllilIi","9Kzg/nEKHj8Wa6MokBJx3PqAuX9oQD67Ve4sqU5+P6lu8z709h2Cbo3qMiH6hPi4">(),
      List.of(class_1802.field_8787)
   );
   private final List<class_2338> IlIlIlIIIi;
   private int lIilIlIIIi;
   private final iilliIlIIiliIl lIIlIlIIIi;
   private final iiIiiilIIliiil iIIlIlIIIi;
   private int llllIlIIIi;
   private Set<class_2248> iiIlIlIIIi;

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (this.llIlIlIIIi > 0) {
            this.llIlIlIIIi--;
         }

         if (this.liIlIlIIIi) {
            this.lIIlliIIll();
         } else if (this.llIlIlIIIi <= 0) {
            this.llIlIlIIIi = 8;
            this.iiiIlIIIll();
            if (this.liIlIlIIIi) {
               this.lIIlliIIll();
            }
         }
      } else {
         this.liIlIlIIIi = false;
      }
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && !this.IlIlIlIIIi.isEmpty()) {
         class_243 var2 = llilllililll.IliIlllilIi();
         class_4587 var3 = event.IliiiIIilliiiIIi;
         var3.method_22903();
         var3.method_22904(-var2.field_1352, -var2.field_1351, -var2.field_1350);
         Color var4 = new Color(
            IIllllIlll(this.iiiIIlIIIi.Iilllilliill()),
            IIllllIlll(this.IIIlIlIIIi.Iilllilliill()),
            IIllllIlll(this.lIIlIlIIIi.Iilllilliill()),
            IIllllIlll(this.liiIIlIIIi.Iilllilliill())
         );
         Color var5 = new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), 255);
         boolean var6 = this.iIIlIlIIIi.Iilllilliill();
         int var7 = var5.getRGB();

         for (class_2338 var9 : this.IlIlIlIIIi) {
            llilllililll.Illillliilli(
               var3,
               (float)var9.method_10263() + 0.001F,
               (float)var9.method_10264() + 0.001F,
               (float)var9.method_10260() + 0.001F,
               (float)var9.method_10263() + 0.999F,
               (float)var9.method_10264() + 0.999F,
               (float)var9.method_10260() + 0.999F,
               var4
            );
            if (var6) {
               Iillllilll.IIlllIlliIll((double)var9.method_10263() + 0.5, (double)var9.method_10264() + 0.5, (double)var9.method_10260() + 0.5, var7, 1.0F);
            }
         }

         var3.method_22909();
         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   private void iiiIlIIIll() {
      long var4 = -5159840349537010100L;
      Set var1 = this.liIlliiIll();
      if (var1.isEmpty()) {
         this.IlIlIlIIIi.clear();
      } else {
         var4 ^= ((long)this.IiiIIlIIIi.Iilllilliill() << 32 ^ var4) & -1L << 32;
         class_2338 var3 = Iiiilllliiilll.field_1724.method_24515();
         this.iiIlIlIIIi = var1;
         this.IIllIlIIIi = var3.method_10263() - (int)(var4 >>> 32);
         this.lIllIlIIIi = var3.method_10263() + (int)(var4 >>> 32);
         this.iIllIlIIIi = var3.method_10264() - (int)(var4 >>> 32);
         this.IlllIlIIIi = var3.method_10264() + (int)(var4 >>> 32);
         this.llllIlIIIi = var3.method_10260() - (int)(var4 >>> 32);
         this.illlIlIIIi = var3.method_10260() + (int)(var4 >>> 32);
         this.iillIlIIIi = this.IIllIlIIIi >> 4;
         this.IIilIlIIIi = this.lIllIlIIIi >> 4;
         this.lIilIlIIIi = this.llllIlIIIi >> 4;
         this.iIilIlIIIi = this.illlIlIIIi >> 4;
         this.IillIlIIIi = this.iillIlIIIi;
         this.lillIlIIIi = this.lIilIlIIIi;
         this.IiIlIlIIIi.clear();
         this.liIlIlIIIi = true;
      }
   }

   private void ilIllIiIll() {
      this.liIlIlIIIi = false;
      this.IlIlIlIIIi.clear();
      this.IlIlIlIIIi.addAll(this.IiIlIlIIIi);
      this.IiIlIlIIIi.clear();
   }

   private int IlIllllIll(class_2818 chunk) {
      int var2 = 0;
      int var3 = chunk.method_12004().method_8326();
      int var4 = chunk.method_12004().method_8328();
      int var5 = Math.max(this.IIllIlIIIi, var3) & 15;
      int var6 = Math.min(this.lIllIlIIIi, var3 + 15) & 15;
      int var7 = Math.max(this.llllIlIIIi, var4) & 15;
      int var8 = Math.min(this.illlIlIIIi, var4 + 15) & 15;
      class_2826[] var9 = chunk.method_12006();
      int var10 = chunk.method_31607();

      for (int var11 = 0; var11 < var9.length; var11++) {
         int var12 = var10 + (var11 << 4);
         if (var12 <= this.IlllIlIIIi && var12 + 15 >= this.iIllIlIIIi) {
            class_2826 var13 = var9[var11];
            if (var13 != null && !var13.method_38292() && var13.method_19523(st -> this.iiIlIlIIIi.contains(st.method_26204()))) {
               var2++;
               int var14 = Math.max(this.iIllIlIIIi, var12) & 15;
               int var15 = Math.min(this.IlllIlIIIi, var12 + 15) & 15;

               for (int var16 = var5; var16 <= var6; var16++) {
                  for (int var17 = var14; var17 <= var15; var17++) {
                     for (int var18 = var7; var18 <= var8; var18++) {
                        if (this.iiIlIlIIIi.contains(var13.method_12254(var16, var17, var18).method_26204())) {
                           this.IiIlIlIIIi.add(new class_2338(var3 + var16, var12 + var17, var4 + var18));
                           if (this.IiIlIlIIIi.size() >= 6000) {
                              return var2;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   public IiiiIlIiliiiIlIi() {
      super(IliIlllilIi<"IliIlllilIi","WcT3q6oB30m/ZFuBi8chj38HmM93smTPVB0008CX+rIWEfSI">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IiiIIlIIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","/gSwlpuddofw4h4ty8m37634FDu3WK8vlbRAzji8QhOn">(),
         IliIlllilIi<"IliIlllilIi","0ywsG9//u+PqKi1eeXgDLBxorUPCfKdmHSzgY/0vFXlUDp9X065xeFNpO/ufz4god2ugwKj9mGsKbcmPpLY=">(),
         16,
         1,
         48
      );
      this.liiIIlIIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","JU3n0kQiwS9J8HAk9qo0Wa5Vebqt4tpiXSQCOcGDPjp1">(),
         IliIlllilIi<"IliIlllilIi","O072LClHhapFoDnIflJla9xC8BjMefzmZw9ttXkx+zz5Au9eCwqEnBEnQxi/YFYio/0nRhiJnF+D4A==">(),
         90,
         1,
         255
      );
      this.iiiIIlIIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","Q50zCkWrLnMzn4hW3H5cpWzKzct1fbsH8r+mvDPcHA==">(),
         IliIlllilIi<"IliIlllilIi","vIJVFkG4ZyKvk091YaJK8QkLk2J9wLhoozWDYjtP5TmIXV4hSDUqD3Xfkto=">(),
         0,
         0,
         255
      );
      this.IIIlIlIIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","Oy3N6i7O3d4g3irC8uYXog/4hUb1G08nK1i5+hqhq9jp">(),
         IliIlllilIi<"IliIlllilIi","Hlzlgd+4xl0lCEmxMwKBGidGG4DnexIPIILFJs7Cos3kPfyMDeaMDwB5psg+LA==">(),
         200,
         0,
         255
      );
      this.lIIlIlIIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","c83ozAIRqABVu3rKrRUSghWTVigZR5Wx8JoyHVUdzqk=">(),
         IliIlllilIi<"IliIlllilIi","OxgGXYqMKhZ5+e1heFwVoThIUkpuyAv2EpHgY5SuU5G4J5zWt+kJmCDVf9no">(),
         255,
         0,
         255
      );
      this.iIIlIlIIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","9WgYp02f81/9GutEFlqM85jg1SxvSnCPi5Ktlzb44AEXtUk=">(),
         IliIlllilIi<"IliIlllilIi","RgvuKWUxL1dZ4FaKzE8DeBlTgGbYCG/zCFcb/dfBAdcM7InLDarCew8qU++b/36vdi9wzXAbSAc3woZ9btwoo2O9PfJ91dixESc=">(),
         false
      );
      this.IlIlIlIIIi = new ArrayList<>();
      this.IiIlIlIIIi = new ArrayList<>();
      this.iiIlIlIIIi = Set.of();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{this.iliIIlIIIi, this.IiiIIlIIIi, this.liiIIlIIIi, this.iiiIIlIIIi, this.IIIlIlIIIi, this.lIIlIlIIIi, this.iIIlIlIIIi}
      );
   }

   @Override
   protected void Iilililiiili() {
      this.IlIlIlIIIi.clear();
      this.IiIlIlIIIi.clear();
      this.liIlIlIIIi = false;
      this.llIlIlIIIi = 0;
   }

   private static int IIllllIlll(int v) {
      return Math.max(0, Math.min(-(~-1892946223) ^ -1892946387, v));
   }

   private void lIIlliIIll() {
      class_638 var1 = Iiiilllliiilll.field_1687;
      int var2 = 12;

      while (this.IillIlIIIi <= this.IIilIlIIIi) {
         if (var1.method_8393(this.IillIlIIIi, this.lillIlIIIi)) {
            class_2818 var3 = var1.method_8497(this.IillIlIIIi, this.lillIlIIIi);
            if (var3 != null) {
               var2 -= this.IlIllllIll(var3);
               if (this.IiIlIlIIIi.size() >= 6000) {
                  this.ilIllIiIll();
                  return;
               }
            }
         }

         if (++this.lillIlIIIi > this.iIilIlIIIi) {
            this.lillIlIIIi = this.lIilIlIIIi;
            this.IillIlIIIi++;
         }

         if (var2 <= 0 && this.IillIlIIIi <= this.IIilIlIIIi) {
            return;
         }
      }

      this.ilIllIiIll();
   }

   private Set<class_2248> liIlliiIll() {
      HashSet var1 = new HashSet();

      for (class_1792 var3 : this.iliIIlIIIi.Iilllilliill()) {
         class_2248 var4 = class_2248.method_9503(var3);
         if (var4 != class_2246.field_10124) {
            var1.add(var4);
         }
      }

      return var1;
   }
}
