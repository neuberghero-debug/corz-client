package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2338;

public final class iIIlIIllIlIlIIll {
   public static final int iIliiiIlll = -1;
   private final List<llllIiIlilllIiIl> illiiiIlll;
   private final boolean iiliiiIlll;
   public static final llllIiIlilllIiIl IlliiiIlll = new llllIiIlilllIiIl(-1, 1.0F, 0, false, false);
   public static final int lIliiiIlll = 9;
   public static final iIIlIIllIlIlIIll llliiiIlll = new iIIlIIllIlIlIIll(List.of(), -1, -1, false);
   private final int liliiiIlll;
   private final int IiliiiIlll;

   public iIIlIIllIlIlIIll(List<llllIiIlilllIiIl> hasteAmp, int fatigueAmp, int submerged, boolean tools) {
      ArrayList var5 = new ArrayList();
      if (hasteAmp != null) {
         for (llllIiIlilllIiIl var7 : hasteAmp) {
            if (var7 != null && var7.lIiiIiIlilli()) {
               var5.add(var7);
            }
         }
      }

      this.illiiiIlll = List.copyOf(var5);
      this.IiliiiIlll = fatigueAmp;
      this.liliiiIlll = submerged;
      this.iiliiiIlll = tools;
   }

   public int IlIlllIlilIl(llllIiIlilllIiIl t, liiiiIiiiiiiIi v, class_2338 onGround, boolean p) {
      if (v != null && onGround != null) {
         float var5 = v.iIlIlllllill(onGround);
         return var5 < 0.0F
            ? Integer.MAX_VALUE
            : IIiiililIiiili.IilliliilIIi(this.IIIllIIliIIl(t, var5, v.lIiiIiIlilli(onGround), v.iliIiiliiiii(onGround), p));
      } else {
         return Integer.MAX_VALUE;
      }
   }

   public llllIiIlilllIiIl Illlllllilll(int slot) {
      for (llllIiIlilllIiIl var3 : this.illiiiIlll) {
         if (var3.liiiIIllIl() == slot) {
            return var3;
         }
      }

      return null;
   }

   public float IIIllIIliIIl(llllIiIlilllIiIl onGround, float hardness, boolean t, int mine, boolean toolRequired) {
      long var10 = -1410724497100639878L;
      llllIiIlilllIiIl var6 = onGround == null ? IlliiiIlll : onGround;
      float var7 = lIiiIiIlilli(var6, mine) ? var6.iIlIlllllill() : 1.0F;
      var10 ^= ((long)(lIiiIiIlilli(var6, mine) ? var6.IilliliilIIi() : 0) << 32 ^ var10) & -1L << 32;
      float var9 = IIiiililIiiili.liiiIIllIl(var7, (int)(var10 >>> 32), this.IiliiiIlll, this.liliiiIlll, this.iiliiiIlll, toolRequired);
      return IIiiililIiiili.iIlIlllllill(var9, hardness, iliIiiliiiii(var6, t, mine));
   }

   public static boolean iliIiiliiiii(llllIiIlilllIiIl mine, boolean t, int toolRequired) {
      if (!t) {
         return true;
      } else if (mine == null || !mine.lIiiIiIlilli()) {
         return false;
      } else {
         return toolRequired == 1 ? true : toolRequired == 2 && mine.iliIiiliiiii();
      }
   }

   public List<llllIiIlilllIiIl> liiiIIllIl() {
      return this.illiiiIlll;
   }

   public static boolean lIiiIiIlilli(llllIiIlilllIiIl mine, int t) {
      return mine != null && mine.lIiiIiIlilli() && t != 0;
   }

   public llllIiIlilllIiIl IIlllIlliIll() {
      long var6 = 8415441876219905311L;
      llllIiIlilllIiIl var1 = null;
      var6 ^= (9223372032559808512L ^ var6) & -1L << 32;

      for (llllIiIlilllIiIl var4 : this.illiiiIlll) {
         var6 ^= ((long)IIiiililIiiili.iliIiiliiiii(var4.iIlIlllllill(), var4.IilliliilIIi(), var4.iliIiiliiiii()) ^ var6) & -1L >>> 32;
         if (var1 == null || (int)var6 < (int)(var6 >>> 32) || (int)var6 == (int)(var6 >>> 32) && var4.IliIlllilIi() && !var1.IliIlllilIi()) {
            var1 = var4;
            var6 ^= ((long)((int)var6) << 32 ^ var6) & -1L << 32;
         }
      }

      return var1;
   }

   public static iIIlIIllIlIlIIll IliIlllilIi(llllIiIlilllIiIl... tools) {
      return new iIIlIIllIlIlIIll(tools == null ? List.of() : List.of(tools), -1, -1, false);
   }

   public boolean iIlIlllllill() {
      return !this.illiiiIlll.isEmpty();
   }

   public IlIllillIlli IiIlliIliiIl(liiiiIiiiiiiIi onGround, class_2338 v, boolean p, boolean hotbarOnly) {
      long var10 = -1153359620459674082L;
      if (onGround != null && v != null && !(onGround.iIlIlllllill(v) < 0.0F)) {
         var10 ^= ((long)this.IlIlllIlilIl(IlliiiIlll, onGround, v, hotbarOnly) << 32 ^ var10) & -1L << 32;
         IlIllillIlli var6 = new IlIllillIlli(-1, (int)(var10 >>> 32), false);

         for (llllIiIlilllIiIl var8 : this.illiiiIlll) {
            if (!p || var8.IliIlllilIi()) {
               var10 ^= ((long)this.IlIlllIlilIl(var8, onGround, v, hotbarOnly) ^ var10) & -1L >>> 32;
               if ((int)var10 < var6.IilliliilIIi()) {
                  var6 = new IlIllillIlli(var8.liiiIIllIl(), (int)var10, true);
               }
            }
         }

         return var6;
      } else {
         return IlIllillIlli.iilliiIIlIIiliiIIl;
      }
   }

   public boolean IilliliilIIi() {
      for (llllIiIlilllIiIl var2 : this.illiiiIlll) {
         if (var2.IliIlllilIi()) {
            return true;
         }
      }

      return false;
   }
}
