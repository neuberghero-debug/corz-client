package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class IllIiiillllIiiil {
   public static final float IiIIIlIiil = 0.34F;
   public static final float iiiiiIIiil = 0.3F;
   public static final float iIliiIIiil = 30.0F;
   public static final float IlliiIIiil = 60.0F;
   public static final float lIiiiIIiil = 15.0F;
   public static final float liiiiIIiil = 1.0E-4F;
   public static final float IlIIIlIiil = 0.3F;
   public static final float iIIIIlIiil = 0.62F;
   private static final Map<String, List<iIiiiilIliiiil>> iIlIIlIiil = new HashMap<>();
   public static final float IIIIIlIiil = 0.46F;
   public static final float lIIIIlIiil = 0.4F;
   static final String[] IIlIIlIiil = new String[]{
      IlIillIiilIi<"IlIillIiilIi","uw2a+zIuDd/KTDhc/QK1VWlhT2SoqDDwyOMvXnzT">(),
      IlIillIiilIi<"IlIillIiilIi","PnN5vLPAoJpFySCyy11ZqcVRvL2oNVWDsDqn+CqrEKM=">(),
      IlIillIiilIi<"IlIillIiilIi","0ayyC7fwiCzH+tMRuam8x3R4pIG6bG5Naoo8xrEl1i4SuA==">()
   };
   public static final float iIiiiIIiil = 90.0F;
   public static final float liliiIIiil = 0.15F;
   public static final float liIIIlIiil = 0.46F;
   public static final float iiliiIIiil = 3.0F;
   public static final float llliiIIiil = 300.0F;
   private static lIIiilIliIIiilIl lIlIIlIiil;
   public static final float ilIIIlIiil = 0.24F;
   public static final float lliiiIIiil = 0.04F;
   public static final float IiliiIIiil = 2400.0F;
   public static final int iiIIIlIiil = 16;
   public static final float IiiiiIIiil = 0.06F;
   public static final float iliiiIIiil = 0.07F;
   public static final float illiiIIiil = 450.0F;
   public static final float IIiiiIIiil = 4.0F;
   public static final float IliiiIIiil = 0.035F;
   public static final float llIIIlIiil = 0.48F;

   static float Iiilliiliiil(float a, float t, float b) {
      return a + (t - a) * b;
   }

   private static void IiIlliIliiIl(
      float[] out, float[] s, float[] b, float[] handle, boolean start, int peak, int h, float stopped, boolean end, List<iIlIIiiIllIIii> t
   ) {
      float var10 = handle[h];
      int var11 = h;
      int var12 = h;

      for (int var13 = peak + 1; var13 <= h; var13++) {
         if (Math.abs(handle[var13] - var10) <= 3.0F) {
            var11 = var13;
            break;
         }
      }

      int var16 = peak + 1;

      for (int var14 = peak + 1; var14 <= h; var14++) {
         if (IIillIiliIil(out, handle, var14) >= stopped) {
            var16 = var14;
            break;
         }
      }

      for (int var17 = var16; var17 < h; var17++) {
         if (IIillIiliIil(out, handle, var17 + 1) < 0.15F * stopped) {
            var12 = var17;
            break;
         }
      }

      int var18 = Math.min(var11, var12);
      if (start) {
         if (Math.abs(Ililllililil(var10)) <= 4.0F) {
            t.add(new iIlIIiiIllIIii(out[var11], ilIIIIIiIiIIIIIi.IlIiliIiil, stopped));
         } else if (stopped >= 450.0F && Math.abs(Ililllililil(s[var11] - b[var11] - 180.0F)) <= 15.0F) {
            t.add(new iIlIIiiIllIIii(out[var11], ilIIIIIiIiIIIIIi.iIIiliIiil, stopped));
         } else if (stopped >= 450.0F && end) {
            t.add(new iIlIIiiIllIIii(out[var18], ilIIIIIiIiIIIIIi.IIIiliIiil, stopped));
         }

         if (stopped >= 450.0F && Math.abs(var10 - handle[peak]) >= 90.0F) {
            for (int var15 = peak + 1; var15 <= h; var15++) {
               if (IIillIiliIil(out, handle, var15) >= 450.0F) {
                  t.add(new iIlIIiiIllIIii(out[var15 - 1], ilIIIIIiIiIIIIIi.iiilliIiil, stopped));
                  break;
               }
            }
         }
      } else if (stopped >= 450.0F) {
         t.add(new iIlIIiiIllIIii(out[var18], ilIIIIIiIiIIIIIi.lIIiliIiil, stopped));
      }
   }

   public static float[] lIiiIiIlilli(lIIiilIliIIiilIl model, lliIiiililiIiiil clip) {
      ArrayList var2 = new ArrayList();

      for (String var6 : IIlIIlIiil) {
         int var7 = model.IiIlliIliiIl(var6);
         if (var7 >= 0 && var7 < clip.IilliliilIIi().length && clip.IilliliilIIi()[var7][1] != null) {
            for (float var11 : clip.IilliliilIIi()[var7][1].IilliliilIIi()) {
               if (var11 >= 0.0F && var11 <= clip.iIlIlllllill()) {
                  var2.add(var11);
               }
            }
         }
      }

      var2.add(0.0F);
      var2.add(clip.iIlIlllllill());
      var2.sort(Float::compare);
      ArrayList var12 = new ArrayList();

      for (float var15 : var2) {
         if (var12.isEmpty() || var15 - (Float)var12.get(var12.size() - 1) > 1.0E-4F) {
            var12.add(var15);
         }
      }

      float[] var14 = new float[var12.size()];

      for (int var16 = 0; var16 < var14.length; var16++) {
         var14[var16] = (Float)var12.get(var16);
      }

      return var14;
   }

   public static List<iIiiiilIliiiil> IIlllIlliIll(List<iIlIIiiIllIIii> length, float events) {
      ArrayList var2 = new ArrayList();

      for (iIlIIiiIllIIii var4 : length) {
         if (!(var4.IliIlllilIi() < 0.0F) && !(var4.IliIlllilIi() > events - 0.06F)) {
            iIlIIiiIllIIii var5 = var2.isEmpty() ? null : (iIlIIiiIllIIii)var2.get(var2.size() - 1);
            if (var5 != null && var4.IliIlllilIi() - var5.IliIlllilIi() < 0.035F) {
               iIlIIiiIllIIii var6 = var4.liiiIIllIl().ilIiliIiil > var5.liiiIIllIl().ilIiliIiil ? var4 : var5;
               var2.set(var2.size() - 1, new iIlIIiiIllIIii(var6.IliIlllilIi(), var6.liiiIIllIl(), Math.max(var4.iIlIlllllill(), var5.iIlIlllllill())));
            } else {
               var2.add(var4);
            }
         }
      }

      ArrayList var10 = new ArrayList();
      Iterator var11 = var2.iterator();

      while (true) {
         iIlIIiiIllIIii var14;
         boolean var17;
         do {
            if (!var11.hasNext()) {
               while (var10.size() > 16) {
                  iIlIIiiIllIIii var12 = null;

                  for (iIlIIiiIllIIii var19 : var10) {
                     if (var12 == null || Illlllllilll(var19) < Illlllllilll(var12)) {
                        var12 = var19;
                     }
                  }

                  var10.remove(var12);
               }

               ArrayList var13 = new ArrayList(var10.size());

               for (iIlIIiiIllIIii var20 : var10) {
                  var13.add(Iilllilliill(var20));
               }

               return List.copyOf(var13);
            }

            var14 = (iIlIIiiIllIIii)var11.next();
            if (var14.liiiIIllIl() != ilIIIIIiIiIIIIIi.iiilliIiil) {
               break;
            }

            var17 = false;

            for (iIlIIiiIllIIii var8 : var2) {
               if (var8.liiiIIllIl() != ilIIIIIiIiIIIIIi.iiilliIiil) {
                  float var9 = var14.IliIlllilIi() - var8.IliIlllilIi();
                  if (var9 >= 0.0F && var9 < 0.07F) {
                     var17 = true;
                  }
               }
            }
         } while (var17);

         iIlIIiiIllIIii var18 = var10.isEmpty() ? null : (iIlIIiiIllIIii)var10.get(var10.size() - 1);
         if (var18 == null || !(var14.IliIlllilIi() - var18.IliIlllilIi() < 0.04F)) {
            var10.add(var14);
         } else if (var14.liiiIIllIl().ilIiliIiil > var18.liiiIIllIl().ilIiliIiil) {
            var10.set(var10.size() - 1, var14);
         }
      }
   }

   static float IIillIiliIil(float[] s, float[] t, int i) {
      float var3 = s[i] - s[i - 1];
      return var3 <= 0.0F ? 0.0F : Math.abs(t[i] - t[i - 1]) / var3;
   }

   public static iIiiiilIliiiil Iilllilliill(iIlIIiiIllIIii e) {
      float var1 = Math.clamp((e.iIlIlllllill() - 450.0F) / 1950.0F, 0.0F, 1.0F);

      float var2 = switch (e.liiiIIllIl()) {
         case iiilliIiil -> Iiilliiliiil(0.3F, 0.46F, var1);
         case llIiliIiil -> Iiilliiliiil(0.24F, 0.34F, var1);
         case IIIiliIiil -> Iiilliiliiil(0.3F, 0.48F, var1);
         case lIIiliIiil -> Iiilliiliiil(0.4F, 0.62F, var1 * 0.85F);
         case iIIiliIiil -> Iiilliiliiil(0.4F, 0.62F, Math.clamp((e.iIlIlllllill() - 300.0F) / 2100.0F, 0.0F, 1.0F));
         case IlIiliIiil -> 0.46F;
      };

      float var3 = switch (e.liiiIIllIl()) {
         case llIiliIiil -> Iiilliiliiil(0.94F, 1.0F, var1);
         case IlIiliIiil -> 1.0F;
         default -> Iiilliiliiil(0.97F, 1.04F, var1);
      };
      return new iIiiiilIliiiil(e.IliIlllilIi(), e.liiiIIllIl().IiIiliIiil, var2, var3);
   }

   static float Ililllililil(float a) {
      float var1 = a % 360.0F;
      if (var1 > 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   static List<iIiiiilIliiiil> liiiIIllIl(lIIiilIliIIiilIl model, lliIiiililiIiiil clip) {
      List var2 = iliIiiliiiii(model, clip);
      if (var2.isEmpty() && !clip.lIiiIiIlilli().isEmpty()) {
         var2 = iIlIlllllill(clip);
      }

      return IIlllIlliIll(var2, clip.iIlIlllllill());
   }

   static float Illlllllilll(iIlIIiiIllIIii e) {
      return (float)e.liiiIIllIl().ilIiliIiil + Math.min(1.0F, e.iIlIlllllill() / 2400.0F) * 0.5F;
   }

   public static List<iIlIIiiIllIIii> iliIiiliiiii(lIIiilIliIIiilIl clip, lliIiiililiIiiil model) {
      float[] var2 = lIiiIiIlilli(clip, model);
      int var3 = clip.IiIlliIliiIl(IlIillIiilIi<"IlIillIiilIi","uw2a+zIuDd/KTDhc/QK1VWlhT2SoqDDwyOMvXnzT">());
      int var4 = clip.IiIlliIliiIl(IlIillIiilIi<"IlIillIiilIi","PnN5vLPAoJpFySCyy11ZqcVRvL2oNVWDsDqn+CqrEKM=">());
      int var5 = clip.IiIlliIliiIl(IlIillIiilIi<"IlIillIiilIi","0ayyC7fwiCzH+tMRuam8x3R4pIG6bG5Naoo8xrEl1i4SuA==">());
      if (var3 >= 0 && var4 >= 0 && var5 >= 0 && var2.length >= 2) {
         float[] var6 = clip.Illlllllilll();
         float[] var7 = new float[var2.length];
         float[] var8 = new float[var2.length];

         for (int var9 = 0; var9 < var2.length; var9++) {
            Arrays.fill(var6, 0.0F);
            model.IliIlllilIi(var2[var9], var6);
            float var10 = var6[var3 * 9 + 3];
            var7[var9] = var6[var4 * 9 + 3] - var10;
            var8[var9] = var6[var5 * 9 + 3] - var10;
         }

         return IIIllIIliIIl(var2, var7, var8);
      } else {
         return List.of();
      }
   }

   static ilIIIIIiIiIIIIIi IilliliilIIi(String effect) {
      String var1 = effect.toLowerCase(Locale.ROOT);
      if (var1.contains(IlIillIiilIi<"IlIillIiilIi","szFEoQm2kYcfsjhea0SvHqLfWLY9KLNG7xa0q5/Kquxu5w==">())
         || var1.contains(IlIillIiilIi<"IlIillIiilIi","HwMGyLvms3jYHD+flNedMDYNyPGTKWeVRU3RYP2ZuRI=">())
         || var1.contains(IlIillIiilIi<"IlIillIiilIi","+ZuU4x4+5HqNwwSpj2WpXHxyWETbQXrVZI60eztshAA/aA==">())
         || var1.contains(IlIillIiilIi<"IlIillIiilIi","7GSDrT38raGrsMfhFTvEpJ/4muIXnN//JYLYs6jl6Fg=">())) {
         return ilIIIIIiIiIIIIIi.iiilliIiil;
      } else {
         return !var1.contains(IlIillIiilIi<"IlIillIiilIi","pw67P0hdbxc+k9TAD8cr5ujkDTGjWfs+RoeViOVxYg==">())
               && !var1.contains(IlIillIiilIi<"IlIillIiilIi","Gs8UBHrLpUgBtkorg48HQethhN87Og4BpEZzpaI94M4K">())
               && !var1.contains(IlIillIiilIi<"IlIillIiilIi","gZ2tRiv4Me4KrzOv9TUUd0yg78iS10FnG2PGfXqy8dc=">())
               && !var1.endsWith(IlIillIiilIi<"IlIillIiilIi","T2X5eV+ZIHaLsQCcJjXRzvaZRCLsUvLSQeG3dFmQ">())
            ? ilIIIIIiIiIIIIIi.IIIiliIiil
            : ilIIIIIiIiIIIIIi.IlIiliIiil;
      }
   }

   public static synchronized List<iIiiiilIliiiil> IliIlllilIi(lIIiilIliIIiilIl clip, lliIiiililiIiiil model) {
      if (clip != null && model != null && model.liiiIIllIl().startsWith(IlIillIiilIi<"IlIillIiilIi","aLRDq8kz6gCpgKpy20m5DuA5bZY3eSOvrPlFX8SQBP9VpDo=">())) {
         if (lIlIIlIiil != clip) {
            iIlIIlIiil.clear();
            lIlIIlIiil = clip;
         }

         return iIlIIlIiil.computeIfAbsent(model.liiiIIllIl(), clipx -> liiiIIllIl(clip, model));
      } else {
         return List.of();
      }
   }

   static List<iIlIIiiIllIIii> iIlIlllllill(lliIiiililiIiiil clip) {
      ArrayList var1 = new ArrayList();
      float var2 = 1230.0F;

      for (IIIilIIilIIilIIi var4 : clip.lIiiIiIlilli()) {
         var1.add(new iIlIIiiIllIIii(var4.IliIlllilIi(), IilliliilIIi(var4.liiiIIllIl()), var2));
      }

      var1.sort(Comparator.comparingDouble(iIlIIiiIllIIii::IliIlllilIi));
      return var1;
   }

   public static List<iIlIIiiIllIIii> IIIllIIliIIl(float[] t, float[] b, float[] h) {
      ArrayList var3 = new ArrayList();
      IlIlllIlilIl(t, b, h, true, var3);
      IlIlllIlilIl(t, b, h, false, var3);
      var3.sort(Comparator.comparingDouble(iIlIIiiIllIIii::IliIlllilIi));
      int var4 = -1;

      for (int var5 = 0; var5 < var3.size(); var5++) {
         if (((iIlIIiiIllIIii)var3.get(var5)).liiiIIllIl() == ilIIIIIiIiIIIIIi.IlIiliIiil) {
            var4 = var5;
         }
      }

      if (var4 >= 0) {
         boolean var7 = false;

         for (int var6 = var4 + 1; var6 < var3.size(); var6++) {
            if (((iIlIIiiIllIIii)var3.get(var6)).liiiIIllIl() != ilIIIIIiIiIIIIIi.iiilliIiil) {
               var7 = true;
            }
         }

         iIlIIiiIllIIii var8 = (iIlIIiiIllIIii)var3.get(var4);
         if (!var7) {
            var3.set(var4, new iIlIIiiIllIIii(var8.IliIlllilIi(), ilIIIIIiIiIIIIIi.llIiliIiil, var8.iIlIlllllill()));
         }
      }

      return var3;
   }

   private IllIiiillllIiiil() {
   }

   private static void IlIlllIlilIl(float[] out, float[] h, float[] b, boolean t, List<iIlIIiiIllIIii> handle) {
      float[] var5 = t ? h : b;
      int var6 = out.length;
      int var7 = 1;

      while (var7 < var6) {
         float var8 = var5[var7] - var5[var7 - 1];
         float var9 = IIillIiliIil(out, var5, var7);
         if (var9 < 30.0F) {
            var7++;
         } else {
            float var10 = Math.signum(var8);
            float var11 = 0.0F;
            int var12 = var7 - 1;
            int var13 = var12;

            for (int var14 = var7; var14 < var6; var13 = var14++) {
               float var15 = var5[var14] - var5[var14 - 1];
               float var16 = IIillIiliIil(out, var5, var14);
               if (Math.signum(var15) != var10 || var16 < 60.0F) {
                  break;
               }

               var11 = Math.max(var11, var16);
            }

            if (var13 == var12) {
               var7++;
            } else {
               boolean var17 = var13 + 1 < var6 && IIillIiliIil(out, var5, var13 + 1) < 60.0F;
               if (var11 >= 300.0F) {
                  IiIlliIliiIl(out, h, b, var5, t, var12, var13, var11, var17, handle);
               }

               var7 = var13 + 1;
            }
         }
      }
   }
}
