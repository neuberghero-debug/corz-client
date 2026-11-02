package gg.corz;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class illIIliIilIIli {
   public static final long IliiIiiiilliiIiiii = 60000L;
   public static final String liiiIiiiiiiiiIiiii = " and more";
   private String iiIIliiiiIIlIliiii;
   private final ilIllIiIll IIIIliiiilIIIliiii;
   private String IiIIliiiiliIIliiii;
   private boolean lIlIliiiiiIlIliiii;
   private final Map<String, Long> iIIIliiiiIlIIliiii = new HashMap<>();
   public static final int iliiIiiiiIiiiIiiii = 2;
   private long llIIliiiiilIIliiii = Long.MIN_VALUE;

   public void IilliliilIIi(String title, String key, String text, long nowMs) {
      if (title != null && text != null) {
         Long var6 = this.iIIIliiiiIlIIliiii.get(title);
         if (var6 == null || nowMs < var6 || nowMs - var6 >= 60000L) {
            this.iIIIliiiiIlIIliiii.put(title, nowMs);
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(key == null ? IIIllIIliIIl<"IIIllIIliIIl","yMxVeY3lkOILAYBRHjD7rQyMFz5sWdMJxU6WQgqRH+QKhOrgsp5FKgeQyQ==">() : key, text, false);
            class_746 var7 = class_310.method_1551().field_1724;
            if (var7 != null) {
               var7.method_7353(
                  class_2561.method_43470(IIIllIIliIIl<"IIIllIIliIIl","zGvlveSmnQMZ0qg+fCSoyL29SPNTl7Mwc1uBdmu6">())
                     .method_27692(class_124.field_1061)
                     .method_10852(class_2561.method_43470(text).method_27692(class_124.field_1068)),
                  false
               );
            }
         }
      }
   }

   public void lIiiIiIlilli() {
      this.iIIIliiiiIlIIliiii.clear();
      this.llIIliiiiilIIliiii = Long.MIN_VALUE;
      this.IiIIliiiiliIIliiii = null;
      this.iiIIliiiiIIlIliiii = null;
      this.lIlIliiiiiIlIliiii = false;
   }

   public String liiiIIllIl() {
      this.iliIiiliiiii();
      return this.iiIIliiiiIIlIliiii;
   }

   private void iliIiiliiiii() {
      long var11 = 3022608036005393056L;
      long var1 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (var1 != this.llIIliiiiilIIliiii) {
         this.llIIliiiiilIIliiii = var1;
         String var3 = null;
         StringBuilder var4 = null;
         var11 ^= (0L ^ var11) & -1L << 32;
         var11 ^= (0L ^ var11) & -1L >>> 32;

         for (ilIllIiIll var8 : llilIllililIll.IilliliilIIi()) {
            if (var8 != null && var8 != this.IIIIliiiilIIIliiii && var8.IliIlllilIi()) {
               String var9 = var8.lIiiIiIlilli();
               if (var3 == null && (ilIIlilIiIIlil.Illlllllilll(var8) || IIiilIIilIiilIIi.IllIiIiiil.contains(var9))) {
                  var3 = var8.IilliliilIIi();
               }

               if (IIiilIIilIiilIIi.lIlIiIiiil.contains(var9)) {
                  if ((int)(var11 >>> 32) < 2) {
                     if (var4 == null) {
                        var4 = new StringBuilder(var8.IilliliilIIi());
                     } else {
                        var4.append(IIIllIIliIIl<"IIIllIIliIIl","fLFl0KboLBXCBz10tqSQPZOZbA30YQVttDLJ2a4m">()).append(var8.IilliliilIIi());
                     }
                  } else if ((int)(var11 >>> 32) == 2) {
                     var4.append(IIIllIIliIIl<"IIIllIIliIIl","7fMggJ4Yk/4mzzvB+gYlflaKvabtvfsBPMsnrFalLh5/qPZK7Q==">());
                  }

                  var11 += 4294967296L;
               }

               if (IIiilIIilIiilIIi.iIlIiIiiil.contains(var9)) {
                  var11 ^= (1L ^ var11) & -1L >>> 32;
               }

               if (var8 instanceof iIIliIiIlIliIi) {
                  iIIliIiIlIliIi var10 = (iIIliIiIlIliIi)var8;
                  if (var10.liIlliiIll()) {
                     var11 ^= (1L ^ var11) & -1L >>> 32;
                  }
               }

               if (var8 instanceof IIiiIillIiiIil) {
                  IIiiIillIiiIil var13 = (IIiiIillIiiIil)var8;
                  if (var13.lliIIliliIIl()) {
                     var11 ^= (1L ^ var11) & -1L >>> 32;
                  }
               }
            }
         }

         this.IiIIliiiiliIIliiii = var3;
         this.iiIIliiiiIIlIliiii = var4 == null ? null : var4.toString();
         this.lIlIliiiiiIlIliiii = (boolean)((int)var11);
      }
   }

   public illIIliIilIIli(ilIllIiIll self) {
      this.IIIIliiiilIIIliiii = self;
   }

   public boolean iIlIlllllill() {
      this.iliIiiliiiii();
      return this.lIlIliiiiiIlIliiii;
   }

   public String IliIlllilIi() {
      this.iliIiiliiiii();
      return this.IiIIliiiiliIIliiii;
   }
}
