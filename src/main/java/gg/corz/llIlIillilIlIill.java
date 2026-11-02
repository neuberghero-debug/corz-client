package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1728;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1914;
import net.minecraft.class_1916;
import net.minecraft.class_2863;
import net.minecraft.class_310;
import net.minecraft.class_465;
import net.minecraft.class_490;

public final class llIlIillilIlIill {
   private String iIIlIilill;
   private boolean IiiIIilill;
   private int iiiIIilill;
   private int lIiIIilill;
   private int iliIIilill;
   private int lilIIilill;
   private IiIlIIiliIlIIi llIIIilill;
   private class_1792 IIIlIilill;
   private int iilIIilill;
   private long IllIIilill;
   private static final int iIIIIilill = 2;
   private int ilIIIilill = 4;
   private int lliIIilill;
   private int IIiIIilill;
   private int liIIIilill;
   private long iIlIIilill;
   private lIllIilliIllIill IilIIilill;
   private static final class_310 lIIIIilill = class_310.method_1551();
   private int lIlIIilill;
   private long lllIIilill;
   private int IliIIilill;
   private ililiiIlIiiliiIl IIlIIilill;
   private static final int IlIIIilill = 60;
   private int lIIlIilill;
   private int IiIIIilill = 30;
   private lIllIilliIllIill iIiIIilill;
   private long illIIilill;
   private Predicate<class_1799> liiIIilill;
   private static final long iiIIIilill = -4611686018427387904L;

   public void iIlIlllllill(Predicate<class_1799> filter) {
      this.liiIIilill = filter;
   }

   private boolean Iiiiliiiiiii(class_1728 trade, lIllIilliIllIill h) {
      if (trade.field_7761.size() <= 2) {
         return false;
      } else {
         class_1799 var3 = trade.method_7611(2).method_7677();
         return var3.method_7960() ? false : this.IIIIllIIIl(var3, h);
      }
   }

   private iIiliIlili IIillIiliIil(class_1728 h) {
      long var4 = 1225198399803966668L;
      switch (this.IIlIIilill) {
         case IillilIlll:
            if (this.Iiiiliiiiiii(h, this.IilIIilill)) {
               this.lilIliilIl(ililiiIlIiiliiIl.llllilIlll);
               this.lllIIilill = this.iIlIIilill;
               return iIiliIlili.IiiiiIIlliiiiIIl;
            } else {
               if (this.IIiIllIiIl() > (long)this.IiIIIilill) {
                  if (this.iilIIilill < 2) {
                     this.iilIIilill++;
                     this.IIlilIliiIli(h, this.IilIIilill.llllIilill);
                     this.lllIIilill = this.iIlIIilill;
                     this.IllIIilill = this.iIlIIilill;
                  } else {
                     this.lilIliilIl(ililiiIlIiiliiIl.iillilIlll);
                     this.illIIilill = this.iIlIIilill;
                     this.IilIIilill = null;
                     if (++this.lIiIIilill >= 3) {
                        this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","2Vgjfy3GlU7D9Zm+BZSfccHyClzIsHvGslOTweZcpDqZFka6hZoniEs0HlrDlXPaP2TIJWyaXLlrbRgf9+R1TDIFFJ9w8zb60pctvhL2Bzc7hEUUTscNA5Jg5n2Cgx+ErRjVBVW8VqTMLw3SfyuH6UttE+NzKyuWlx4bUNg693qCValJQLucx62MMi79MeIYmws92z6zpcU+kWhhnbw=">();
                        this.lilIliilIl(ililiiIlIiiliiIl.iIllilIlll);
                        return iIiliIlili.lllIIlIlillIIlIl;
                     }

                     this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","6OJWLEQqYJqsYWHCW95wB8qEvbIRm+40R0wxRSiFKsOiK9UDriNy8vOb7FV1am6v">();
                  }
               }

               return iIiliIlili.IiiiiIIlliiiiIIl;
            }
         case IlllilIlll:
            if (this.iIlIIilill - this.lllIIilill < (long)this.ilIIIilill) {
               return iIiliIlili.IiiiiIIlliiiiIIl;
            } else {
               if (this.Ililllililil()) {
                  class_1799 var6 = h.field_7761.size() > 2 ? h.method_7611(2).method_7677() : class_1799.field_8037;
                  var4 ^= ((long)(h.method_34255().method_7960() && !var6.method_7960() ? this.IIIilIIiiIIi(h, var6) : -1) << 32 ^ var4) & -1L << 32;
                  if ((int)(var4 >>> 32) < 0) {
                     this.IilIIilill = null;
                     this.lilIliilIl(ililiiIlIiiliiIl.iIllilIlll);
                     if (!var6.method_7960() && h.method_34255().method_7960()) {
                        this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","62ct+a0374NbezLFSCRwQiXpqcDZDKpalLyDCV9FDCntYAs9e+xZOHTv">();
                        return iIiliIlili.liIIIlIliiIIIlIl;
                     }

                     return iIiliIlili.IiiiiIIlliiiiIIl;
                  }

                  lIIIIilill.field_1761.method_2906(this.lIlIIilill, 2, 0, class_1713.field_7790, lIIIIilill.field_1724);
                  this.lliIIilill = (int)(var4 >>> 32);
                  this.lllIIilill = this.iIlIIilill;
                  this.lilIliilIl(ililiiIlIiiliiIl.illlilIlll);
                  return iIiliIlili.IiiiiIIlliiiiIIl;
               }

               lIIIIilill.field_1761.method_2906(this.lIlIIilill, 2, 0, class_1713.field_7794, lIIIIilill.field_1724);
               this.lllIIilill = this.iIlIIilill;
               this.lilIliilIl(ililiiIlIiiliiIl.IillilIlll);
               return iIiliIlili.IiiiiIIlliiiiIIl;
            }
         case iillilIlll:
            if (this.iIlIIilill - this.lllIIilill < 1L) {
               return iIiliIlili.IiiiiIIlliiiiIIl;
            }

            class_1799 var2 = h.method_34255();
            if (!var2.method_7960() && this.IIIIllIIIl(var2, this.IilIIilill)) {
               var4 ^= ((long)(IlIillIiilIi(h, this.lliIIilill, var2) ? this.lliIIilill : this.IIIilIIiiIIi(h, var2)) << 32 ^ var4) & -1L << 32;
               if ((int)(var4 >>> 32) >= 0) {
                  lIIIIilill.field_1761.method_2906(this.lIlIIilill, (int)(var4 >>> 32), 0, class_1713.field_7790, lIIIIilill.field_1724);
               }
            }

            this.lliIIilill = -1;
            this.lllIIilill = this.iIlIIilill;
            this.lilIliilIl(ililiiIlIiiliiIl.IillilIlll);
            return iIiliIlili.IiiiiIIlliiiiIIl;
         case lillilIlll:
            var4 ^= ((long)this.iIIIlIlIIl(this.IilIIilill) ^ var4) & -1L >>> 32;
            if ((int)var4 > this.lilIIilill) {
               this.IiIiliIiiiIi((int)var4 - this.lilIIilill);
               this.lilIliilIl(this.IllIllllIl() ? ililiiIlIiiliiIl.lillilIlll : ililiiIlIiiliiIl.iillilIlll);
               return iIiliIlili.iiiiiIIlIIIIIlIl;
            }

            if (this.IIiIllIiIl() > (long)this.liIIIilill) {
               this.iIiIIilill = this.IilIIilill;
               this.IliIIilill = this.lilIIilill;
               this.lilIliilIl(ililiiIlIiiliiIl.iillilIlll);
               this.illIIilill = this.iIlIIilill;
               this.IilIIilill = null;
               this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","lVPS7jwVb6+IBrbK03zR6T6amZOtrssgF3/pJy3jMii+kO75CyLl9QuLS2Bl">();
            }

            return iIiliIlili.IiiiiIIlliiiiIIl;
         case iIllilIlll:
            if (this.iIlIIilill - this.lllIIilill < 1L) {
               return iIiliIlili.IiiiiIIlliiiiIIl;
            } else {
               if (h.method_34255().method_7960() && this.IIiIllIiIl() <= (long)this.liIIIilill) {
                  var4 ^= ((long)this.llIIlilIIl(this.IilIIilill) ^ var4) & -1L >>> 32;
                  if ((int)var4 >= 0) {
                     lIIIIilill.field_1761.method_2906(this.lIlIIilill, (int)var4, 1, class_1713.field_7795, lIIIIilill.field_1724);
                     this.lllIIilill = this.iIlIIilill;
                     return iIiliIlili.IiiiiIIlliiiiIIl;
                  }

                  this.lilIliilIl(ililiiIlIiiliiIl.iillilIlll);
                  return iIiliIlili.IiiiiIIlliiiiIIl;
               }

               this.lilIliilIl(ililiiIlIiiliiIl.iillilIlll);
               return iIiliIlili.IiiiiIIlliiiiIIl;
            }
         default:
            return iIiliIlili.IiiiiIIlliiiiIIl;
      }
   }

   public void Illlllllilll() {
      this.llIIIilill = null;
      this.IIlIIilill = ililiiIlIiiliiIl.iIllilIlll;
      this.IilIIilill = null;
   }

   private class_1728 illIlIilIl() {
      if (lIIIIilill.field_1724 == null) {
         return null;
      } else if (lIIIIilill.field_1755 instanceof class_465 && !(lIIIIilill.field_1755 instanceof class_490)) {
         return lIIIIilill.field_1724.field_7512 instanceof class_1728 var1 ? var1 : null;
      } else {
         return null;
      }
   }

   public void IliIlllilIi(IiIlIIiliIlIIi tradeDelay, int target) {
      this.liiiIIllIl(tradeDelay, target, false);
   }

   public lIllIilliIllIill lIiiIiIlilli() {
      return this.IilIIilill;
   }

   private long IIiIllIiIl() {
      return this.iIlIIilill - this.IllIIilill;
   }

   private int llIIlilIIl(lIllIilliIllIill trade) {
      long var6 = -8132865899807478079L;
      class_1728 var2 = this.illIlIilIl();
      if (var2 == null) {
         return -1;
      } else {
         var6 ^= ((long)(var2.field_7761.size() - 36) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) < 0) {
            return -1;
         } else {
            for (long var9 = var6 ^ ((long)((int)(var6 >>> 32)) ^ var6) & -1L >>> 32;
               (int)var9 < var2.field_7761.size();
               var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32
            ) {
               class_1799 var5 = var2.method_7611((int)var9).method_7677();
               if (this.IIIIllIIIl(var5, trade) && (this.liiIIilill == null || this.liiIIilill.test(var5))) {
                  return (int)var9;
               }
            }

            return -1;
         }
      }
   }

   private lIllIilliIllIill Iliilliiilii(List<lIllIilliIllIill> offers) {
      lIllIilliIllIill var2 = null;

      for (lIllIilliIllIill var4 : offers) {
         if (IIilIlIllIilIlIl.IliIlllilIi(this.llIIIilill, var4)) {
            if (var2 == null) {
               var2 = var4;
            } else if (this.llIIIilill.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl) {
               if (var4.lIIiIilill < var2.lIIiIilill) {
                  var2 = var4;
               }
            } else if (var4.iIilIilill > var2.iIilIilill) {
               var2 = var4;
            }
         }
      }

      return var2;
   }

   private static boolean IlIillIiilIi(class_1728 h, int slot, class_1799 stack) {
      if (slot >= h.field_7761.size() - 36 && slot >= 0 && slot < h.field_7761.size()) {
         class_1799 var3 = h.method_7611(slot).method_7677();
         return var3.method_7960() ? true : class_1799.method_31577(var3, stack) && var3.method_7947() + stack.method_7947() <= var3.method_7914();
      } else {
         return false;
      }
   }

   private void lilIliilIl(ililiiIlIiiliiIl p) {
      this.IIlIIilill = p;
      this.IllIIilill = this.iIlIIilill;
   }

   public String IiIlliIliiIl() {
      return this.iIIlIilill;
   }

   public String IIlllIlliIll() {
      return this.IilIIilill == null ? iIiIlIliIl<"iIiIlIliIl","TL3vUVacMOPgkCOYfqzgIX+KJU8sgh3Fb6jIr2k=">() : this.IilIIilill.iliIiiliiiii();
   }

   public boolean IilliliilIIi() {
      return this.llIIIilill != null;
   }

   private String Iilililiiili(List<lIllIilliIllIill> offers) {
      long var7 = 8015378779823416451L;
      long var9 = -5835399252528837479L;
      if (this.llIIIilill.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl && this.llIIIilill.iIIiiIiliIlIiiIili == ililIlIiilIl.liiIIilliiiIIill) {
         class_1792 var11 = IiiIlliiIl.iIlIlllllill(this.llIIIilill.lIliiIiliiIliiIili);

         for (lIllIilliIllIill var4 : offers) {
            if (var11 != null && var4.lIilIilill == var11) {
               var7 ^= ((long)(this.llIIIilill.IlliiIilillliiIili > 0 && var4.lIIiIilill > this.llIIIilill.IlliiIilillliiIili ? 0 : 1) << 32 ^ var7)
                  & -1L << 32;
               return iIiIlIliIl<"iIiIlIliIl","HcUb4OhxH6iFpk+Qe6yh4UuAgzopy7qh3toHuUsVqBZB">()
                  + IiiIlliiIl.lIiiIiIlilli(this.llIIIilill.lIliiIiliiIliiIili)
                  + iIiIlIliIl<"iIiIlIliIl","sriizbko7HOssibwT7g+qfs8Qh1tKHQAsdzuOC3df7E=">()
                  + this.llIIIilill.IlliiIilillliiIili
                  + iIiIlIliIl<"iIiIlIliIl","XarR4iPlmCozxzHEcGBChCNTmYRUmYe90sYG3ALI0y1cX6WnlBOO">()
                  + var4.lIIiIilill
                  + iIiIlIliIl<"iIiIlIliIl","dGec02HoLSbhMYz3O3hfCYZ27qPOKhgDil5Dt8yPVb7QnQ==">()
                  + var4.IlilIilill
                  + iIiIlIliIl<"iIiIlIliIl","4Lkdsae2NhrZxF1oz7o6ntqbaDgSoVLgpbQmoHk=">()
                  + var4.llilIilill
                  + iIiIlIliIl<"iIiIlIliIl","1bSykbKFJM7LFtiFowNnKZhzBjvANBEZGpuO8QDPN8Z7Nn1YvQ==">()
                  + var4.iIlIlllllill()
                  + iIiIlIliIl<"iIiIlIliIl","FGCUq4qFpmLY7MniNMDUELNCn1n0GeDlP/lQAlwXFe4fYtKU">()
                  + (int)(var7 >>> 32);
            }
         }

         return iIiIlIliIl<"iIiIlIliIl","NWmfn+XFhU7743pI93roIqYAnftFamf0OKAD3m/pkA==">()
            + IiiIlliiIl.lIiiIiIlilli(this.llIIIilill.lIliiIiliiIliiIili)
            + iIiIlIliIl<"iIiIlIliIl","biJQyocbrunjQcDgiWhsJkQI1qBMnovRBs7crO6sNTl6iblvFmYpJUc=">()
            + this.IIiilIiiiIii(offers)
            + iIiIlIliIl<"iIiIlIliIl","uQFtVhBpJzi5nKTjquuOQ2ovW/LUh+e9+VhEqL4=">();
      } else if (this.llIIIilill.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl && this.llIIIilill.iIIiiIiliIlIiiIili == ililIlIiilIl.IliIIilllliIIill) {
         for (lIllIilliIllIill var3 : offers) {
            if (var3.IlIiIilill) {
               var7 ^= ((long)(var3.llIiIilill != null && IliiiiIilliiiiIi.iIlIlllllill(var3.llIiIilill, this.llIIIilill.IiIiiIililiIiiIili) ? 1 : 0) ^ var7)
                  & -1L >>> 32;
               var7 ^= ((long)(var3.IiIiIilill >= Math.max(1, this.llIIIilill.iiIiiIiliIIliiIili) ? 1 : 0) << 32 ^ var7) & -1L << 32;
               var9 ^= ((long)(this.llIIIilill.IlliiIilillliiIili > 0 && var3.lIIiIilill > this.llIIIilill.IlliiIilillliiIili ? 0 : 1) << 32 ^ var9)
                  & -1L << 32;
               return iIiIlIliIl<"iIiIlIliIl","pa+7Pt7LU6JS/N+sw5GJd6jE7PutigfOuP8D/13b088zbw==">()
                  + this.llIIIilill.IiIiiIililiIiiIili
                  + iIiIlIliIl<"iIiIlIliIl","pqnVJz96BShphqn6BI0JFnf3YvTRQLeJAA9W2SFTXQ==">()
                  + this.llIIIilill.iiIiiIiliIIliiIili
                  + iIiIlIliIl<"iIiIlIliIl","sriizbko7HOssibwT7g+qfs8Qh1tKHQAsdzuOC3df7E=">()
                  + this.llIIIilill.IlliiIilillliiIili
                  + iIiIlIliIl<"iIiIlIliIl","6bERdfwQx5r3sfxM7qR/dZ2DgCVosmw2tVDRSYikK4RQNh7v">()
                  + var3.ilIiIilill
                  + iIiIlIliIl<"iIiIlIliIl","pqnVJz96BShphqn6BI0JFnf3YvTRQLeJAA9W2SFTXQ==">()
                  + var3.IiIiIilill
                  + iIiIlIliIl<"iIiIlIliIl","bV90tWJixfi1AyH/f7FUHudlVNDsTPYWphe+7JhoQQZz">()
                  + var3.lIIiIilill
                  + iIiIlIliIl<"iIiIlIliIl","1bSykbKFJM7LFtiFowNnKZhzBjvANBEZGpuO8QDPN8Z7Nn1YvQ==">()
                  + var3.iIlIlllllill()
                  + iIiIlIliIl<"iIiIlIliIl","NPiJCbszmdEX7/Xkwu6JKipVz+W4tdDbp0UtXerSH7HHqCcP">()
                  + (int)var7
                  + iIiIlIliIl<"iIiIlIliIl","QIFRUx55Mi3nzet8kuZ4jrmoEsg2Lu9xlA0BCpQ5NdVJHP8=">()
                  + (int)(var7 >>> 32)
                  + iIiIlIliIl<"iIiIlIliIl","FGCUq4qFpmLY7MniNMDUELNCn1n0GeDlP/lQAlwXFe4fYtKU">()
                  + (int)(var9 >>> 32);
            }
         }

         return iIiIlIliIl<"iIiIlIliIl","F4y5kzbmmmODz9SrqLZvCyi83VdnM/Cq9F/iFL0KPTg9kkgN+I/ijq17WvNsIIIzMcIayxv2MZRO8A==">()
            + this.IIiilIiiiIii(offers)
            + iIiIlIliIl<"iIiIlIliIl","uQFtVhBpJzi5nKTjquuOQ2ovW/LUh+e9+VhEqL4=">();
      } else {
         return iIiIlIliIl<"iIiIlIliIl","u2aIQX/o29BBUGB1TYGRc688RL5vXyagZbRcbJYRbkMEEqriDqoP/YcrsI4=">()
            + this.IIiilIiiiIii(offers)
            + iIiIlIliIl<"iIiIlIliIl","uQFtVhBpJzi5nKTjquuOQ2ovW/LUh+e9+VhEqL4=">();
      }
   }

   public void liiiIIllIl(IiIlIIiliIlIIi tradeDelay, int target, boolean assisted) {
      this.llIIIilill = tradeDelay;
      this.IiiIIilill = assisted;
      this.iliIIilill = 0;
      this.ilIIIilill = Math.max(1, target);
      this.IIlIIilill = ililiiIlIiiliiIl.iIllilIlll;
      this.lIlIIilill = -1;
      this.IilIIilill = null;
      this.iilIIilill = 0;
      this.IIiIIilill = 0;
      this.lIiIIilill = 0;
      this.iIiIIilill = null;
      this.iiiIIilill = 0;
      this.IIIlIilill = null;
      this.lIIlIilill = 0;
      this.lllIIilill = -4611686018427387904L;
      this.illIIilill = -4611686018427387904L;
      this.iIIlIilill = "";
   }

   private boolean Ililllililil() {
      return this.Iiilliiliiil(this.IilIIilill);
   }

   private void IiIiliIiiiIi(int gain) {
      this.lIIlIilill += gain;
      if (this.llIIIilill != null) {
         this.llIIIilill.lliiiIiliiliiiIili += gain;
      }

      this.illIIilill = this.iIlIIilill;
      this.lIiIIilill = 0;
   }

   private boolean IllIllllIl() {
      return this.llIIIilill != null && this.llIIIilill.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl && this.llIIIilill.iIiiiIiliIliiiIili;
   }

   private boolean Iiilliiliiil(lIllIilliIllIill trade) {
      long var3 = -7352518387487341306L;
      if (this.llIIIilill != null && this.llIIIilill.liliiIiliiiliiIili > 0 && trade != null) {
         var3 ^= ((long)(this.llIIIilill.liliiIiliiiliiIili - this.llIIIilill.lliiiIiliiliiiIili) << 32 ^ var3) & -1L << 32;
         return (int)(var3 >>> 32) < trade.liiiIIllIl() * Math.max(1, trade.iIilIilill);
      } else {
         return false;
      }
   }

   private boolean lIlIliIlIl(lIllIilliIllIill trade) {
      long var5 = -1881139925713159170L;
      class_1661 var2 = lIIIIilill.field_1724.method_31548();

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 36; var7 += 4294967296L) {
         class_1799 var4 = var2.method_5438((int)(var7 >>> 32));
         if (var4.method_7960()) {
            return true;
         }

         if (var4.method_31574(trade.lIilIilill) && !trade.IlIiIilill && var4.method_7947() < var4.method_7914()) {
            return true;
         }
      }

      return false;
   }

   private List<lIllIilliIllIill> Illillliilli(class_1728 h) {
      long var6 = -74285234142734987L;
      ArrayList var2 = new ArrayList();
      class_1916 var3 = h.method_17438();

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < var3.size(); var8 += 4294967296L) {
         class_1914 var5 = (class_1914)var3.get((int)(var8 >>> 32));
         if (var5 != null) {
            var2.add(lIllIilliIllIill.IliIlllilIi(var5, (int)(var8 >>> 32)));
         }
      }

      return var2;
   }

   public iIiliIlili Iilllilliill() {
      long var5 = -3511599453575636058L;
      if (this.llIIIilill == null) {
         return iIiliIlili.lllIIlIlillIIlIl;
      } else if (lIIIIilill.field_1724 != null && lIIIIilill.field_1761 != null) {
         class_1728 var1 = this.illIlIilIl();
         if (var1 == null) {
            return iIiliIlili.iIlIIlIlIllIIlIl;
         } else {
            this.iIlIIilill++;
            if (this.lIlIIilill < 0) {
               this.lIlIIilill = var1.field_7763;
            } else if (this.lIlIIilill != var1.field_7763) {
               this.lIlIIilill = var1.field_7763;
               this.lilIliilIl(ililiiIlIiiliiIl.iIllilIlll);
               this.IilIIilill = null;
            }

            if (this.IIlIIilill != ililiiIlIiiliiIl.iIllilIlll && this.IIlIIilill != ililiiIlIiiliiIl.iillilIlll) {
               if (this.IilIIilill != null) {
                  return this.IIillIiliIil(var1);
               }

               this.lilIliilIl(ililiiIlIiiliiIl.iIllilIlll);
            }

            if (this.IIlIIilill == ililiiIlIiiliiIl.iillilIlll && this.iIlIIilill - this.illIIilill < (long)this.ilIIIilill) {
               return iIiliIlili.IiiiiIIlliiiiIIl;
            } else {
               class_1799 var2 = var1.method_34255();
               if (var2.method_7960()) {
                  this.iliIIilill = 0;
                  if (this.iIiIIilill != null) {
                     var5 ^= ((long)(this.iIIIlIlIIl(this.iIiIIilill) - this.IliIIilill) << 32 ^ var5) & -1L << 32;
                     this.iIiIIilill = null;
                     if ((int)(var5 >>> 32) > 0) {
                        this.IiIiliIiiiIi((int)(var5 >>> 32));
                        this.lilIliilIl(ililiiIlIiiliiIl.iillilIlll);
                        return iIiliIlili.iiiiiIIlIIIIIlIl;
                     }
                  }

                  if (!this.llIIIilill.IIlllIlliIll()) {
                     return iIiliIlili.IIlIIlIllIlIIlIl;
                  } else {
                     List var3 = this.Illillliilli(var1);
                     if (var3.isEmpty()) {
                        if (++this.IIiIIilill <= 60) {
                           return iIiliIlili.IiiiiIIlliiiiIIl;
                        } else {
                           this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","QyqdAD+kxwUN1H47Fb86mD7MJs7nz8FoyuqNpNGjzFZz4hEaR/+mGkZhWz6pAdaFLh7m">();
                           return iIiliIlili.lIIIIlIliIIIIlIl;
                        }
                     } else {
                        this.IIiIIilill = 0;
                        lIllIilliIllIill var4 = this.Iliilliiilii(var3);
                        if (var4 == null) {
                           this.iIIlIilill = this.Iilililiiili(var3);
                           return iIiliIlili.lIIIIlIliIIIIlIl;
                        } else if (var4.illlIilill == class_1802.field_8687 && this.iiIIlIIlIl(var1, class_1802.field_8687) < var4.IillIilill) {
                           this.iiiIIilill = var4.IillIilill;
                           this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","j9fc4rZaKZxjRzx7323fRRtph3ZrM45posAm4UsPu50geA==">()
                              + this.iiiIIilill
                              + iIiIlIliIl<"iIiIlIliIl","geyViWibBoVhdQpoJkG/SThR5TaLCgLv/RUNu+c21JeQMRp1vQ==">();
                           return iIiliIlili.IlIIIlIlllIIIlIl;
                        } else if (var4.lillIilill == class_1802.field_8687 && this.iiIIlIIlIl(var1, class_1802.field_8687) < var4.iillIilill) {
                           this.iiiIIilill = var4.iillIilill;
                           this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","j9fc4rZaKZxjRzx7323fRRtph3ZrM45posAm4UsPu50geA==">()
                              + this.iiiIIilill
                              + iIiIlIliIl<"iIiIlIliIl","geyViWibBoVhdQpoJkG/SThR5TaLCgLv/RUNu+c21JeQMRp1vQ==">();
                           return iIiliIlili.IlIIIlIlllIIIlIl;
                        } else if (var4.illlIilill != null
                           && var4.illlIilill != class_1802.field_8687
                           && this.iiIIlIIlIl(var1, var4.illlIilill) < var4.IillIilill) {
                           this.IIIlIilill = var4.illlIilill;
                           this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","j9fc4rZaKZxjRzx7323fRRtph3ZrM45posAm4UsPu50geA==">()
                              + IiiIlliiIl.IlIlllIlilIl(this.IIIlIilill);
                           return iIiliIlili.ilIIIlIlIiIIIlIl;
                        } else if (var4.IilliliilIIi() && var4.lillIilill != class_1802.field_8687 && this.iiIIlIIlIl(var1, var4.lillIilill) < var4.iillIilill) {
                           this.IIIlIilill = var4.lillIilill;
                           this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","j9fc4rZaKZxjRzx7323fRRtph3ZrM45posAm4UsPu50geA==">()
                              + IiiIlliiIl.IlIlllIlilIl(this.IIIlIilill);
                           return iIiliIlili.ilIIIlIlIiIIIlIl;
                        } else if (!this.IllIllllIl() && !this.lIlIliIlIl(var4)) {
                           this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","62ct+a0374NbezLFSCRwQiXpqcDZDKpalLyDCV9FDCntYAs9e+xZOHTv">();
                           return iIiliIlili.liIIIlIliiIIIlIl;
                        } else if (this.Iiilliiliiil(var4) && this.IIIilIIiiIIi(var1, var4.IIilIilill) < 0) {
                           this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","62ct+a0374NbezLFSCRwQiXpqcDZDKpalLyDCV9FDCntYAs9e+xZOHTv">();
                           return iIiliIlili.liIIIlIliiIIIlIl;
                        } else {
                           this.IilIIilill = var4;
                           this.IIlilIliiIli(var1, var4.llllIilill);
                           this.lilIIilill = this.iIIIlIlIIl(var4);
                           this.lllIIilill = this.iIlIIilill;
                           this.iilIIilill = 0;
                           this.lilIliilIl(ililiiIlIiiliiIl.IlllilIlll);
                           return iIiliIlili.IiiiiIIlliiiiIIl;
                        }
                     }
                  }
               } else if (this.IiiIIilill) {
                  return iIiliIlili.IiiiiIIlliiiiIIl;
               } else {
                  var5 ^= ((long)this.IIIilIIiiIIi(var1, var2) << 32 ^ var5) & -1L << 32;
                  if ((int)(var5 >>> 32) >= 0 && ++this.iliIIilill <= 3) {
                     lIIIIilill.field_1761.method_2906(this.lIlIIilill, (int)(var5 >>> 32), 0, class_1713.field_7790, lIIIIilill.field_1724);
                     this.illIIilill = this.iIlIIilill;
                     this.lilIliilIl(ililiiIlIiiliiIl.iillilIlll);
                     return iIiliIlili.IiiiiIIlliiiiIIl;
                  } else {
                     this.iIIlIilill = iIiIlIliIl<"iIiIlIliIl","sT8uOipuOiyx4TbwoLdXdpaMBO86Qjf4WWktrZlGScuf/yCZmsbUHD57f/JPNiY29ICHOm8wj3hoyg==">()
                        + ((int)(var5 >>> 32) < 0 ? iIiIlIliIl<"iIiIlIliIl","eRwaeVhrEOPhI4giEOX5TuSrkEdeBzEjoLfyVQJtgzkNCVYRJgH6SIFtM9k0AP60w5TfPyRN">() : "");
                     return iIiliIlili.lllIIlIlillIIlIl;
                  }
               }
            }
         }
      } else {
         return iIiliIlili.lllIIlIlillIIlIl;
      }
   }

   private int iiIIlIIlIl(class_1728 item, class_1792 h) {
      long var6 = -1363745273474292603L;
      var6 ^= ((long)this.IiIIlliIIl(h) << 32 ^ var6) & -1L << 32;

      for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < 2 && (int)var6 < item.field_7761.size(); var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         class_1799 var5 = item.method_7611((int)var6).method_7677();
         if (var5.method_31574(h)) {
            var6 ^= ((long)((int)(var6 >>> 32) + var5.method_7947()) << 32 ^ var6) & -1L << 32;
         }
      }

      return (int)(var6 >>> 32);
   }

   private String IIiilIiiiIii(List<lIllIilliIllIill> offers) {
      StringBuilder var2 = new StringBuilder();

      for (lIllIilliIllIill var4 : offers) {
         if (var2.length() > 0) {
            var2.append(iIiIlIliIl<"iIiIlIliIl","pBn4UauH2/wzkSijgewv1xYW9stUJr3dQOcvdJa7">());
         }

         var2.append(var4.iliIiiliiiii())
            .append(iIiIlIliIl<"iIiIlIliIl","Ksp4kVHn83w0PUlXPdhmomW15ZEFClJAlp4Mrkk=">())
            .append(var4.lIIiIilill)
            .append(iIiIlIliIl<"iIiIlIliIl","jJCwwzChB8KkjQjdgVZPyHJK6uBF5gDLty8GYFI=">())
            .append(
               var4.iIlIlllllill()
                  ? ""
                  : iIiIlIliIl<"iIiIlIliIl","ze4i81AUL+TquSCzO4t1zryoPyUjLMjyOm4i6a75">()
                     + var4.IlilIilill
                     + iIiIlIliIl<"iIiIlIliIl","4Lkdsae2NhrZxF1oz7o6ntqbaDgSoVLgpbQmoHk=">()
                     + var4.llilIilill
                     + (var4.ililIilill ? iIiIlIliIl<"iIiIlIliIl","5Iomk/9e7/sYmopaRoT+iN3xcYuGMJxPIHaZMT+lY/w=">() : "")
                     + iIiIlIliIl<"iIiIlIliIl","Xhkz33Rl5ozTRzpXRLN271UqaqznXwtZdfDd03w=">()
            );
      }

      return var2.toString();
   }

   private void IIlilIliiIli(class_1728 index, int h) {
      index.method_7650(h);
      lIIIIilill.field_1724.field_3944.method_52787(new class_2863(h));
   }

   private boolean IIIIllIIIl(class_1799 trade, lIllIilliIllIill st) {
      if (trade == null || trade.method_7960()) {
         return false;
      } else {
         return st.IlIiIilill
            ? llIIiliilIIili.IilliliilIIi(
               trade,
               st.ilIiIilill.isEmpty()
                  ? iIiIlIliIl<"iIiIlIliIl","R7NsdhFT+9JdsiXopgSld2P7of2nmdzUi5ce0U6IJw==">()
                  : IliiiiIilliiiiIi.lIiiIiIlilli(st.llIiIilill),
               Math.max(1, st.IiIiIilill)
            )
            : trade.method_31574(st.lIilIilill);
      }
   }

   public int IlIlllIlilIl() {
      return this.lIIlIilill;
   }

   public llIlIillilIlIill() {
      this.liIIIilill = 40;
      this.IIlIIilill = ililiiIlIiiliiIl.iIllilIlll;
      this.lIlIIilill = -1;
      this.lllIIilill = -4611686018427387904L;
      this.illIIilill = -4611686018427387904L;
      this.lliIIilill = -1;
      this.iIIlIilill = "";
   }

   private int IiIIlliIIl(class_1792 item) {
      long var6 = -6192681689103364668L;
      class_1661 var2 = lIIIIilill.field_1724.method_31548();
      var6 ^= (0L ^ var6) & -1L << 32;

      for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 <= 35; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         class_1799 var5 = var2.method_5438((int)var6);
         if (var5.method_31574(item)) {
            var6 ^= ((long)((int)(var6 >>> 32) + var5.method_7947()) << 32 ^ var6) & -1L << 32;
         }
      }

      return (int)(var6 >>> 32);
   }

   public int iliIiiliiiii() {
      return this.iiiIIilill;
   }

   public class_1792 IIIllIIliIIl() {
      return this.IIIlIilill;
   }

   private int iIIIlIlIIl(lIllIilliIllIill trade) {
      long var6 = 7991296439524506905L;
      class_1661 var2 = lIIIIilill.field_1724.method_31548();
      var6 ^= (0L ^ var6) & -1L << 32;

      for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 <= 35; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         class_1799 var5 = var2.method_5438((int)var6);
         if (this.IIIIllIIIl(var5, trade)) {
            var6 ^= ((long)((int)(var6 >>> 32) + var5.method_7947()) << 32 ^ var6) & -1L << 32;
         }
      }

      return (int)(var6 >>> 32);
   }

   private int IIIilIIiiIIi(class_1728 h, class_1799 stack) {
      long var8 = 8409172313586345546L;
      long var10 = 5056786555600127145L;
      long var12 = 1948653352255534125L;
      var8 ^= ((long)(h.field_7761.size() - 36) << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) < 0) {
         return -1;
      } else {
         var8 ^= ((long)((int)(var8 >>> 32) + 27) ^ var8) & -1L >>> 32;
         var10 ^= (0L ^ var10) & -1L << 32;

         while ((int)(var10 >>> 32) < 2) {
            var10 ^= ((long)((int)(var10 >>> 32) == 1 ? 1 : 0) ^ var10) & -1L >>> 32;

            for (var12 ^= ((long)((int)(var8 >>> 32)) << 32 ^ var12) & -1L << 32; (int)(var12 >>> 32) < h.field_7761.size(); var12 += 4294967296L) {
               if (((int)(var12 >>> 32) >= (int)var8 ? 1 : 0) == (int)var10
                  && !h.method_7611((int)(var12 >>> 32)).method_7677().method_7960()
                  && IlIillIiilIi(h, (int)(var12 >>> 32), stack)) {
                  return (int)(var12 >>> 32);
               }
            }

            for (var12 ^= ((long)((int)(var8 >>> 32)) << 32 ^ var12) & -1L << 32; (int)(var12 >>> 32) < h.field_7761.size(); var12 += 4294967296L) {
               if (((int)(var12 >>> 32) >= (int)var8 ? 1 : 0) == (int)var10 && h.method_7611((int)(var12 >>> 32)).method_7677().method_7960()) {
                  return (int)(var12 >>> 32);
               }
            }

            var10 += 4294967296L;
         }

         return -1;
      }
   }
}
