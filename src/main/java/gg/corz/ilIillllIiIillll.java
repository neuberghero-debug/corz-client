package gg.corz;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_7923;
import net.minecraft.class_2338.class_2339;

final class ilIillllIiIillll implements llIillIlilIillIl {
   @Override
   public int IilliliilIIi() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      return var1 == null ? 0 : var1.liiIiiiIll;
   }

   @Override
   public String Iliilliiilii() {
      try {
         return ilIllIiIll.Iiiilllliiilll.method_1548().method_1676();
      } catch (Throwable var2) {
         return iIiIlIliIl<"iIiIlIliIl","LVPJU/Vh9g10FTfV+YVK9MD/fHBVHyRW5TYmC1t7M39ZDO8=">();
      }
   }

   @Override
   public int iliIiiliiiii() {
      return this.illIlIilIl();
   }

   @Override
   public IIlIiIilIlIiIi IiIIlliIIl() {
      return IIlIiIilIlIiIi.IliIlllilIi(this.iiIIliIill.IiiiIiliIl.Iilllilliill());
   }

   @Override
   public lliIiIIliliIiIIl llIIlilIIl() {
      return switch (this.iiIIliIill.iiIliiliIl) {
         case iliIlliIiIiiIlliIi, lIIilliIiiIIilliIi -> lliIiIIliliIiIIl.IIIllIilIl;
         default -> lliIiIIliliIiIIl.lIIllIilIl;
         case iilIlliIiIIiIlliIi, IIIIiliIilIIIiliIi, iIlilliIiIllilliIi, iiIllliIiIIlllliIi, IlIilliIillIilliIi, liIilliIiiiIilliIi, iIillliIiIlillliIi -> lliIiIIliliIiIIl.iIIllIilIl;
         case liiilliIiiiiilliIi, lIiilliIiiIiilliIi, llillliIiilillliIi, IliilliIilliilliIi, ilIilliIiIiIilliIi -> lliIiIIliliIiIIl.IlIllIilIl;
         case iIIIiliIiIlIIiliIi -> lliIiIIliliIiIIl.llIllIilIl;
         case lllIlliIiillIlliIi, IIIllliIilIIllliIi -> lliIiIIliliIiIIl.ilIllIilIl;
      };
   }

   @Override
   public boolean IIIIllIIIl() {
      return this.iiIIliIill.lIIIliliIl.Iilllilliill();
   }

   @Override
   public Set<String> lIlIliIlIl() {
      String var1 = this.iiIIliIill.IIIIliliIl.Iilllilliill();
      if (var1 != null && !var1.isBlank()) {
         HashSet var2 = new HashSet();

         for (String var6 : var1.split(iIiIlIliIl<"iIiIlIliIl","bz4pzb2kXDMgSMSgDItXJRLSIcMTS0PaEw0rRhxeJXCOrA==">())) {
            if (!var6.isBlank()) {
               var2.add(var6.trim().toLowerCase(Locale.ROOT));
            }
         }

         return var2;
      } else {
         return Collections.emptySet();
      }
   }

   private boolean lilIliilIl(class_2680 want) {
      return want != null && iIlIilIlIllIilIl.liIiiiiIii(want) != class_1802.field_8162;
   }

   @Override
   public String Iiiiliiiiiii() {
      return ilIllIiIll.Iiiilllliiilll.field_1724 == null ? "" : ilIllIiIll.Iiiilllliiilll.field_1724.method_5667().toString();
   }

   @Override
   public int Illlllllilll() {
      return this.iiIIliIill.lliiilliIl.Ililllililil();
   }

   @Override
   public boolean IIIilIIiiIIi() {
      return this.iiIIliIill.IliIlllilIi();
   }

   @Override
   public llIIliIiilIIliIi Ililllililil() {
      return this.iiIIliIill.iiililliIl.lIiiIiIlilli() != null && ilIllIiIll.Iiiilllliiilll.field_1687 != null
         ? new llIIliIiilIIliIi(
            new iIliIlIlIlliIlIl(
               this.iiIIliIill.lIIiilliIl,
               this.iiIIliIill.iIIiilliIl,
               this.iiIIliIill.IlIiilliIl,
               this.iiIIliIill.IliiilliIl.Ililllililil(),
               this.iiIIliIill.lliiilliIl.Ililllililil()
            ),
            this.iiIIliIill.lliillIliliillIl()
         )
         : null;
   }

   @Override
   public double Illillliilli() {
      return ilIllIiIll.Iiiilllliiilll.field_1724 == null ? 0.0 : ilIllIiIll.Iiiilllliiilll.field_1724.method_73189().field_1351;
   }

   @Override
   public String IIiilIiiiIii() {
      return this.iiIIliIill.lliillIliliillIl();
   }

   private int illIlIilIl() {
      if (!this.iiIIliIill.iilIiIllIIiIiIll()) {
         return 0;
      } else {
         List var1 = this.iiIIliIill.IIIiilliIl.Iilllilliill();
         int var2 = Math.min(this.iiIIliIill.IIIiilliIl.Illlllllilll().size(), var1.size());
         int var3 = 0;

         for (int var4 = 0; var4 < var2; var4++) {
            if (iIlIilIlIllIilIl.liIiiiiIii((class_2680)var1.get(var4)) != class_1802.field_8162) {
               var3++;
            }
         }

         return var3;
      }
   }

   @Override
   public int IlIlllIlilIl() {
      return this.iiIIliIill.iIIiilliIl;
   }

   @Override
   public IiiIIlllliiIIlll iIIIlIlIIl() {
      IiiIIlllliiIIlll var1 = new IiiIIlllliiIIlll();
      if (this.iiIIliIill.lIIIliliIl.Iilllilliill() && ilIllIiIll.Iiiilllliiilll.field_1724 != null && this.iiIIliIill.iilIiIllIIiIiIll()) {
         Set var2 = this.iiIIliIill.lIiIiIlliIiIiIll(this.iiIIliIill.IIIiilliIl.Iilllilliill());
         class_1661 var3 = ilIllIiIll.Iiiilllliiilll.field_1724.method_31548();

         for (int var4 = 0; var4 <= 35; var4++) {
            class_1799 var5 = var3.method_5438(var4);
            if (!var5.method_7960() && var2.contains(var5.method_7909())) {
               var1.IliIlllilIi(class_7923.field_41178.method_10221(var5.method_7909()).toString(), var5.method_7947());
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private ilIillllIiIillll(final iIlIilIlIllIilIl param1) {
      this.iiIIliIill = var1;
   }

   @Override
   public void IllIllllIl(String msg) {
      long var3 = -4383417521390749925L;
      var3 ^= (
            (long)(
                     !msg.startsWith(iIiIlIliIl<"iIiIlIliIl","QZMhr0aOKQAFWwhGG6RTstRJooyWEQiV0ddlEgcr+A==">())
                           && !msg.contains(iIiIlIliIl<"iIiIlIliIl","Nn+DtvsW9YzkQxdE6j6EDpWo5mDyTc/De1GNwV2TaZg6v9iA5G+mE1l6">())
                           && !msg.contains(iIiIlIliIl<"iIiIlIliIl","5uYA35atnUzslFqylmQXKlYs+S8XFCJe2L43/m2+FxQ5RTx8jgZO">())
                        ? 0
                        : 1
                  )
                  << 32
               ^ var3
         )
         & -1L << 32;
      if ((int)(var3 >>> 32) != 0) {
         this.iiIIliIill.IiilIiiliilIii(msg);
      }

      if ((int)(var3 >>> 32) == 0) {
         this.iiIIliIill.iiilIiiIIIiIii(msg);
      }
   }

   @Override
   public String iiIIlIIlIl() {
      return this.iiIIliIill.liiiIiliIl.Iilllilliill() == null ? "" : this.iiIIliIill.liiiIiliIl.Iilllilliill().trim();
   }

   @Override
   public IIIIliilIIIlii IIillIiliIil() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      if (var1 == null) {
         return IIIIliilIIIlii.IliIlllilIi("", 0, 0, 0, 0, 0L);
      } else if (var1 == this.iiIIliIill.lliIlllIll && this.iiIIliIill.iliIlllIll != null) {
         return this.iiIIliIill.iliIlllIll;
      } else {
         IIiillIllIiillIl var2 = IlilIlllilIl.liiiIIllIl(var1);
         this.iiIIliIill.iliIlllIll = IIIIliilIIIlii.IliIlllilIi(
            var1.iliIiiiIll, var1.IiiIiiiIll, var1.liiIiiiIll, var1.iiiIiiiIll, var2.liiiIIllIl(), var2.IliIlllilIi()
         );
         this.iiIIliIill.lliIlllIll = var1;
         return this.iiIIliIill.iliIlllIll;
      }
   }

   @Override
   public int IiIlliIliiIl() {
      return this.iiIIliIill.IlIiilliIl;
   }

   @Override
   public int IIlllIlliIll() {
      return this.iiIIliIill.IliiilliIl.Ililllililil();
   }

   @Override
   public String liiiIIllIl() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      return var1 == null ? "" : var1.iliIiiiIll;
   }

   @Override
   public boolean Iiilliiliiil(llIIliIiilIIliIi a) {
      return this.iiIIliIill.IiiillIlliiillIl(a, iIiIlIliIl<"iIiIlIliIl","K98Dp7UFtxDFjk/Ako8jdLBgag2xMsuz31WsIzsYiVE=">());
   }

   @Override
   public llliiiIiilliiiIi IlIillIiilIi(IiiiIiIlliiiIiIl gen, long job) {
      if (ilIllIiIll.Iiiilllliiilll.field_1687 != null && this.iiIIliIill.liiliiliIl != null && this.iiIIliIill.iiiliiliIl != null) {
         this.iiIIliIill.llIilIiilIilIi(new class_2338(gen.IliilliIll, gen.lliilliIll, gen.iliilliIll));
         if (this.iiIIliIill.IlilliIIll != null && this.iiIIliIill.IlilliIIll.size() == this.iiIIliIill.liiliiliIl.size()) {
            if (this.iiIIliIill.liiIlllIll != null && !this.iiIIliIill.liiIlllIll.equals(this.iiIIliIill.lliillIliliillIl())) {
               return this.IIiIllIiIl(gen, job);
            } else {
               int var4 = 0;
               int var5 = 0;
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               class_2339 var9 = new class_2339();

               for (int var10 = gen.IliilliIll; var10 <= gen.IiiilliIll; var10++) {
                  for (int var11 = gen.lliilliIll; var11 <= gen.liiilliIll; var11++) {
                     for (int var12 = gen.iliilliIll; var12 <= gen.iiiilliIll; var12++) {
                        Integer var13 = this.iiIIliIill.IlilliIIll.get(class_2338.method_10064(var10, var11, var12));
                        if (var13 != null && var13 >= 0 && var13 < this.iiIIliIill.iiiliiliIl.size()) {
                           class_2680 var14 = this.iiIIliIill.iiiliiliIl.get(var13);
                           if (this.lilIliilIl(var14)) {
                              var8++;
                              if (!ilIllIiIll.Iiiilllliiilll.field_1687.method_31601(var11)
                                 && ilIllIiIll.Iiiilllliiilll.field_1687.method_8393(var10 >> 4, var12 >> 4)) {
                                 var9.method_10103(var10, var11, var12);
                                 class_2680 var15 = ilIllIiIll.Iiiilllliiilll.field_1687.method_8320(var9);
                                 if (var15.method_26204() != var14.method_26204()) {
                                    if (!var15.method_26215() && !var15.method_45474()) {
                                       var6++;
                                    } else {
                                       var5++;
                                    }
                                 } else if (this.iiIIliIill.IIIllllIIlll(var9.method_10062(), var14)) {
                                    var4++;
                                 } else {
                                    var6++;
                                 }
                              } else {
                                 var7++;
                              }
                           }
                        }
                     }
                  }
               }

               var7 += Math.max(0, gen.IIIIiliIll - var8);
               return new llliiiIiilliiiIi(gen.iililliIll, job, gen.IIIIiliIll, var4, var5, var6, var7, iIlIilIlIllIilIl.llIilIiiIl);
            }
         } else {
            return this.IIiIllIiIl(gen, job);
         }
      } else {
         return this.IIiIllIiIl(gen, job);
      }
   }

   @Override
   public int lIiiIiIlilli() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      return var1 == null ? 0 : var1.iiiIiiiIll;
   }

   @Override
   public double IIlilIliiIli() {
      return ilIllIiIll.Iiiilllliiilll.field_1724 == null ? 0.0 : ilIllIiIll.Iiiilllliiilll.field_1724.method_73189().field_1352;
   }

   @Override
   public int iIlIlllllill() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      return var1 == null ? 0 : var1.IiiIiiiIll;
   }

   @Override
   public iIIllIlIlIllIl IiIiliIiiiIi() {
      return new iIIllIlIlIllIl(
         2,
         iIiIlIliIl<"iIiIlIliIl","mdSMfsRWCWalTdApuQ/BSv/2+bBjvy5fmFKoHEo5SglmRiY=">(),
         iIiIlIliIl<"iIiIlIliIl","3bWciNL5bh7fhZdz6ae+7uzXyRATh+DK92hXkHAMCnYHLwzOD2dfMQ==">(),
         iIiIlIliIl<"iIiIlIliIl","4x9y4NfShi3YaLFdv5mIY0/2eW0HunpgUQ3uIQzKd82kzRGc3WnpHGyeEB0=">(),
         iIiIlIliIl<"iIiIlIliIl","ORbbyNtqUGV/quYgM91koWgtAvrRo5n2Sd3soF29XsmRwc2nI9Y4N5gyuVSWRcKdLyAP45Fdc6G/jmQS6JjG0g7bQ4FvHNublUT0Yckh">(),
         this.IIillIiliIil().Ililllililil(),
         this.IIlllIlliIll()
            + iIiIlIliIl<"iIiIlIliIl","ItaYUQE1BHMUMlt1Tt5O0bCpGXU2TfnbvN+5aXo=">()
            + this.Illlllllilll()
            + iIiIlIliIl<"iIiIlIliIl","ItaYUQE1BHMUMlt1Tt5O0bCpGXU2TfnbvN+5aXo=">()
            + this.IIIllIIliIIl()
            + iIiIlIliIl<"iIiIlIliIl","4OMVeVfyp6hQCHr8WczSkaHG/dSaLiWsarDhzNU=">()
            + this.IlIlllIlilIl()
            + iIiIlIliIl<"iIiIlIliIl","4OMVeVfyp6hQCHr8WczSkaHG/dSaLiWsarDhzNU=">()
            + this.IiIlliIliiIl()
      );
   }

   @Override
   public int IIIllIIliIIl() {
      return this.iiIIliIill.lIIiilliIl;
   }

   private llliiiIiilliiiIi IIiIllIiIl(IiiiIiIlliiiIiIl job, long gen) {
      return new llliiiIiilliiiIi(job.iililliIll, gen, job.IIIIiliIll, 0, 0, 0, job.IIIIiliIll, iIlIilIlIllIilIl.llIilIiiIl);
   }

   @Override
   public double Iilililiiili() {
      return ilIllIiIll.Iiiilllliiilll.field_1724 == null ? 0.0 : ilIllIiIll.Iiiilllliiilll.field_1724.method_73189().field_1350;
   }

   @Override
   public void Iilllilliill(iiIlIIiIIllIIi c) {
      if (this.iiIIliIill.iilIiIllIIiIiIll()) {
         List var2 = this.iiIIliIill.IIIiilliIl.Illlllllilll();
         List var3 = this.iiIIliIill.IIIiilliIl.Iilllilliill();
         int var4 = Math.min(var2.size(), var3.size());

         for (int var5 = 0; var5 < var4; var5++) {
            class_1792 var6 = iIlIilIlIllIilIl.liIiiiiIii((class_2680)var3.get(var5));
            if (var6 != class_1802.field_8162) {
               class_2338 var7 = (class_2338)var2.get(var5);
               c.accept(var7.method_10263(), var7.method_10264(), var7.method_10260(), class_7923.field_41178.method_10221(var6).toString());
            }
         }
      }
   }

   @Override
   public boolean IliIlllilIi() {
      return this.iiIIliIill.iiililliIl.lIiiIiIlilli() != null;
   }
}
