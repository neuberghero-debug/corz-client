package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1304;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2824;
import net.minecraft.class_490;
import net.minecraft.class_746;

public class lIllIiiiIllIii extends ilIllIiIll {
   private final iiIiiilIIliiil iilIiilIIl;
   private Object iliIiilIIl;
   private static final String iIlIiilIIl = "Toggle";
   private final iiIiiilIIliiil lIiIiilIIl;
   private final iilliIlIIiliIl lilIiilIIl;
   private final lliliIIiililiIIi illIiilIIl = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","9+9cHRuRtrMaKkQqXt4GJZnj1KpVUs+S6v7LUGSFVTnyWyRaL88=">(),
      IliIlllilIi<"IliIlllilIi","2VZD3OQQMXolhXrw98aZQydGh4eCM9zHnwQ/TZZYF4JxoeM+Pf0mFyxYpoLxgs9uO+ENXIxv0niPataeK44TKbT7CCQdy4kByXXrHR5B0cwn5xsDpmcHEtOrjOklFQaoH6fYF3++pUcCBFXxJHIzdv+6tVY=">(),
      IliIlllilIi<"IliIlllilIi","3mQ39+fJyv22P04CBEPVUNI6oqI98l4VrvaJ7P9dTGmTOQ==">(),
      IliIlllilIi<"IliIlllilIi","3mQ39+fJyv22P04CBEPVUNI6oqI98l4VrvaJ7P9dTGmTOQ==">(),
      IliIlllilIi<"IliIlllilIi","9nqyCcRi0uSw6qzdLmnbHmqltrzvQnd+nAz1IY0XcmZBbQ==">()
   );
   private final iiIiiilIIliiil IilIiilIIl = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","gt80BJEYlyFZT1UWaQoS6RDjkcyMD46ad+lSeD9x3bNVg52cLfOV0a1s">(),
      IliIlllilIi<"IliIlllilIi","bRFYVfFjsuhaNLbAOU3acQ9BF++R9G3m4cXtphDaQWMJtuavQhFXFgLuOr6SXVrAeXc8tWroQ3VCwLhiS/m94IT0ixyZYHCW7QwW66CTFhHeMp6PvcmkghMVGeGuey4g17m7BfXp5zsjmz6UvVE5EvZcq8mxKzPznTnoSpX0u9EW0r3/pNGDzEecmHHDD1QPv2IR">(),
      true
   );
   private final llliIIiilliIIi lliIiilIIl;
   private final iiIiiilIIliiil IIiIiilIIl;
   private static final String IllIiilIIl = "On Key";
   private final IIIlIlIllIIlIlIl iIiIiilIIl;
   private final lllliliilllili IliIiilIIl;
   private static final class_1304[] lllIiilIIl = new class_1304[]{
      class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166, class_1304.field_6171
   };

   private void ilIllIiIll(List<lIliIlIiiIliIlIi> stack, class_1799 entries) {
      ilIlIiilIiIlIiil var3 = ilIlIiilIiIlIiil.iIlIlllllill(entries);
      if (var3 != null) {
         stack.add(IIllllIlll(-1, entries, var3, true, false));
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (Iiiilllliiilll.field_1687 != this.iliIiilIIl) {
            this.iliIiilIIl = Iiiilllliiilll.field_1687;
            this.lliIiilIIl.IliIlllilIi();
         }

         boolean var2 = this.IliIiilIIl.liiiIIllIl(Iiiilllliiilll);
         this.lliIiilIIl
            .iIlIlllllill(
               kind -> iillilIiIIililIi.IIillIiliIil(var1, kind), this.IliIiilIIl.iIlIlllllill(), var1.method_23317(), var1.method_23318(), var1.method_23321()
            );
         if (var2) {
            boolean var3 = IliIlllilIi<"IliIlllilIi","9nqyCcRi0uSw6qzdLmnbHmqltrzvQnd+nAz1IY0XcmZBbQ==">().equals(this.illIiilIIl.Iilllilliill());
            boolean var4 = this.IliIiilIIl.IIlllIlliIll();
            if (!var3 || !var4 && this.IliIiilIIl.IIillIiliIil() <= 200) {
               if (iillilIiIIililIi.liiiIIllIl(Iiiilllliiilll, this) && iillilIiIIililIi.IiIlliIliiIl(var1) && var1.method_64271()) {
                  int var5 = this.IlIllllIll(var1);
                  if (var5 < 0) {
                     if (this.IliIiilIIl.IIIilIIiiIIi(Iiiilllliiilll) && var3) {
                        this.IIillIiliIil(false);
                     }
                  } else {
                     this.IliIiilIIl.Iiilliiliiil();
                     IlllIlilllllIlil var6 = this.IliIiilIIl.IiIlliIliiIl(var5, var1.method_31548().method_5438(var5));
                     if (var6 == IlllIlilllllIlil.llliIIiIil) {
                        this.IliIiilIIl.IlIillIiilIi(Iiiilllliiilll);
                        if (var3) {
                           this.IIillIiliIil(false);
                        }
                     } else if (var6 != IlllIlilllllIlil.IlliIIiIil) {
                        boolean var7 = Iiiilllliiilll.field_1755 instanceof class_490;
                        if (var3 || !this.IliIiilIIl.lIiiIiIlilli()) {
                           if (this.IilIiilIIl.Iilllilliill() && !var7) {
                              if (var3) {
                                 this.IliIiilIIl.Ililllililil(Iiiilllliiilll);
                              }
                           } else if (!var7 || this.IliIiilIIl.Illlllllilll()) {
                              boolean var8 = !var7 && var3 && !var1.method_5715() && iillilIiIIililIi.IlIlllIlilIl();
                              if (var7 || var8 || iillilIiIIililIi.Illlllllilll(var1)) {
                                 this.iIlllIllll(var1, var5, var8);
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               this.lIIlliIIll();
            }
         }
      } else {
         this.IliIiilIIl.IliIlllilIi();
      }
   }

   public lIllIiiiIllIii() {
      super(IliIlllilIi<"IliIlllilIi","Cme+OKoTt6ujg8NdF84Vbga1kT+TNLKydvkRQNVzHneznD+sfQ0TDVxyOEmK">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.lilIiilIIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","wafsU1kmieeyUgyid4db3vY03Sr06UeBvhm15V58uQDr">(),
         IliIlllilIi<"IliIlllilIi","TE3jyezNTqYtrMMMssTdiJIGBsYXY725AfWGDpPl89/axCxORdB8BV/jEnVNSr9bgTm/Y/9enCi8/z/rwKRzsBfeJzfsIyjDySRc7T4oJ33P">(),
         150,
         100,
         500,
         10
      );
      this.iilIiilIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","EacUEr7IZ6a4SlyrSY1Huz36yYZ4aZdogoYbADMO+aM8Ec0OU0o=">(),
         IliIlllilIi<"IliIlllilIi","mSZvEAG7DdXHyz0+EwEh9DTfCkSofGckSo1K7x2cAYeTeKAUfLgzx+gEMjYc66cWWyAQmeMZrIOHivRXM8lejezHMjqzZhTPYFFjPpn6lWhIjPyVypUij/S1PeHio4xU5eVvwQuRVsmN1yx8IOasEJlHF7/cGxmvoXWYz4Z49fbBRQMW2BGfjg==">(),
         true
      );
      this.IIiIiilIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","u5+629NjwiLp+rHyvyCRawZDbALq+cM+/zHKVNBWwtFqvZdkdPxUP431b8uitptuUUVO">(),
         IliIlllilIi<"IliIlllilIi","hx32Je0Vr0P0Pb9yuR2J6OcLkxMxRAxJ1SNiA0aL+wcrUZLmJgkIZdua0fA0hWFZm5Bfr007wpFoXuV/OUl9U0FmLVb0u485fOGlFeSpTZnsMCLR1N2bqArHSEKxL0nJLS4OFWtgM5srynFP6A==">(),
         true
      );
      this.lIiIiilIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","tiRKjSjKpPK0GD067Y4dvVXjl8VAajd3wL0GodHykLOPIFS9xtkO">(),
         IliIlllilIi<"IliIlllilIi","0PBW7xPY64G1SroEFkHn9e3c70LUTiEOW7G31Z7YR6mT3eQGdt4YNqtz3nglrDp7S0EXj5T7Fvh6Jd5XIlXJYg==">(),
         false
      );
      this.iIiIiilIIl = new IIIlIlIllIIlIlIl(
         IliIlllilIi<"IliIlllilIi","DwT5Z9so0TV4Q8eAJ4Bu5XGzdWvBgeWcYc9Hnbeh6L9RE37lbjrI">(),
         IliIlllilIi<"IliIlllilIi","pvEY2oYCgiSNBeUriH2QuLJtHwpqWdilw2jdPGucQ5bxmEVMZpvY2iDP5k570nPdU2FQl2aLGeXMRPNHsKrSbddyd1j8M/Bgz2IBmgzsfb1jrhGuyuvSVbab6q+pyjJU62Qfr0PW/uH3b71kIE/3iao7x9qWCTl0Aw==">(),
         List.of(
            class_1802.field_8600,
            class_1802.field_8276,
            class_1802.field_8145,
            class_1802.field_8153,
            class_1802.field_8469,
            class_1802.field_8511,
            class_1802.field_8635
         )
      );
      this.IliIiilIIl = new lllliliilllili(this);
      this.lliIiilIIl = new llliIIiilliIIi();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{this.illIiilIIl, this.IilIiilIIl, this.lilIiilIIl, this.iilIiilIIl, this.IIiIiilIIl, this.lIiIiilIIl, this.iIiIiilIIl}
      );
   }

   private void liIlliiIll(List<lIliIlIiiIliIlIi> entries, int slot, class_1799 best, boolean stack) {
      long var8 = -6993603519962789855L;
      if (!best.method_7960()) {
         var8 ^= ((long)(!iillilIiIIililIi.IIIilIIiiIIi(best) && !lllIIllillIIll.IliIlllilIi(slot) && !lllIIllillIIll.liiiIIllIl(slot) ? 0 : 1) << 32 ^ var8)
            & -1L << 32;
         var8 ^= ((long)((int)(var8 >>> 32) == 0 && this.iiiIlIIIll(best) ? 1 : 0) ^ var8) & -1L >>> 32;
         ilIlIiilIiIlIiil var7 = stack ? ilIlIiilIiIlIiil.iIlIlllllill(best) : null;
         if ((int)var8 != 0 || var7 != null) {
            entries.add(IIllllIlll(slot, best, var7, (boolean)((int)(var8 >>> 32)), (boolean)((int)var8)));
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.IliIiilIIl.IliIlllilIi();
      this.lliIiilIIl.IliIlllilIi();
      this.iliIiilIIl = null;
   }

   private void lIIlliIIll() {
      this.IliIiilIIl.IlIillIiilIi(Iiiilllliiilll);
      this.IIillIiliIil(false);
   }

   private static lIliIlIiiIliIlIi IIllllIlll(int stack, class_1799 slot, ilIlIiilIiIlIiil keep, boolean kind, boolean junk) {
      double var5 = iIliilIlIlliilIl.IilliliilIIi(slot);
      return keep == null
         ? new lIliIlIiiIliIlIi(stack, -1, 0.0, kind, junk, var5)
         : new lIliIlIiiIliIlIi(
            stack,
            keep.ordinal(),
            iIliilIlIlliilIl.IliIlllilIi(slot, keep),
            kind,
            junk,
            var5,
            iIliilIlIlliilIl.liiiIIllIl(slot, keep),
            iIliilIlIlliilIl.iIlIlllllill(slot, false),
            iIliilIlIlliilIl.iIlIlllllill(slot, true)
         );
   }

   private int IlIllllIll(class_746 p) {
      class_1661 var2 = p.method_31548();
      boolean var3 = this.iilIiilIIl.Iilllilliill();
      ArrayList var4 = new ArrayList(41);
      if (var3) {
         for (class_1304 var8 : lllIiilIIl) {
            this.ilIllIiIll(var4, p.method_6118(var8));
         }
      }

      for (int var9 = 0; var9 < 36; var9++) {
         this.liIlliiIll(var4, var9, var2.method_5438(var9), var3);
      }

      for (int var11 : iiilIlIlIIIiIlIl.IliIlllilIi(var4, var3)) {
         class_1799 var12 = var2.method_5438(var11);
         if (!this.IliIiilIIl.IlIlllIlilIl(var11, var12) && !this.lliIiilIIl.IilliliilIIi(var12)) {
            return var11;
         }
      }

      return -1;
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (event.lIiilIIIIi instanceof class_2824 var2 && Iiiilllliiilll.method_18854() && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
         this.IliIiilIIl.IilliliilIIi();
      }
   }

   public boolean iiiIlIIIll(class_1799 stack) {
      if (stack != null && !stack.method_7960() && !iillilIiIIililIi.IIIilIIiiIIi(stack)) {
         if (this.iIiIiilIIl.Iiilliiliiil(stack.method_7909())) {
            return true;
         } else {
            return this.IIiIiilIIl.Iilllilliill() && iillilIiIIililIi.IlIillIiilIi(stack)
               ? true
               : this.lIiIiilIIl.Iilllilliill() && iillilIiIIililIi.IiIiliIiiiIi(stack);
         }
      } else {
         return false;
      }
   }

   @Override
   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1724 != null) {
         this.IliIiilIIl.IlIillIiilIi(Iiiilllliiilll);
      }

      this.IliIiilIIl.IliIlllilIi();
      this.lliIiilIIl.IliIlllilIi();
      this.iliIiilIIl = null;
   }

   private void iIlllIllll(class_746 slot, int p, boolean mask) {
      class_1799 var4 = slot.method_31548().method_5438(p).method_7972();
      this.IliIiilIIl
         .IiIiliIiiiIi(
            () -> {
               long var7 = 684191868640223204L;
               if (this.IliIlllilIi() && iillilIiIIililIi.iIlIlllllill(Iiiilllliiilll, this)) {
                  class_746 var3 = Iiiilllliiilll.field_1724;
                  if (var3.method_64271() && iillilIiIIililIi.IiIlliIliiIl(var3)) {
                     if (!lllIIllillIIll.liiiIIllIl(p) && !lllIIllillIIll.IliIlllilIi(p)) {
                        class_1799 var4x = var3.method_31548().method_5438(p);
                        if (iillilIiIIililIi.Iilllilliill(var4x, var4) && !iillilIiIIililIi.IIIilIIiiIIi(var4x)) {
                           if (lIlillliIlilll.IliIlllilIi(this)) {
                              try {
                                 var7 ^= ((long)var3.field_7498.field_7763 << 32 ^ var7) & -1L << 32;
                                 Iiiilllliiilll.field_1761.method_2906((int)(var7 >>> 32), iillilIiIIililIi.IliIlllilIi(p), 1, class_1713.field_7795, var3);
                                 this.IliIiilIIl.IIlilIliiIli();
                                 this.IliIiilIIl.IIIllIIliIIl(p, var4);
                                 this.lliIiilIIl
                                    .liiiIIllIl(
                                       var4,
                                       iillilIiIIililIi.IIillIiliIil(var3, var4),
                                       this.IliIiilIIl.iIlIlllllill(),
                                       var3.method_23317(),
                                       var3.method_23318(),
                                       var3.method_23321()
                                    );
                                 iillilIiIIililIi.Ililllililil(Iiiilllliiilll, (int)(var7 >>> 32));
                              } finally {
                                 lIlillliIlilll.liiiIIllIl(this);
                              }
                           }
                        }
                     }
                  }
               }
            },
            mask,
            this.lilIiilIIl.Iilllilliill()
         );
   }
}
