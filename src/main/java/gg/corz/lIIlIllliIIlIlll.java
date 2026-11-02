package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1542;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class lIIlIllliIIlIlll {
   public static final double iilIlIIill = 0.05;
   private int liIllIIill;
   public static final long lliIlIIill = 3000L;
   public static final double IliIlIIill = 0.6;
   private final Map<Long, Long> lIIllIIill;
   public static final int IIiIlIIill = 3;
   private boolean llIllIIill;
   public static final int lilIlIIill = 4;
   public static final float iIiIlIIill = 0.5F;
   private static final class_2350[] iliIlIIill = new class_2350[]{
      class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034
   };
   private String iiIllIIill;
   public static final float lIiIlIIill = 8.0F;
   private final lilllllliillllll IiiIlIIill;
   private long IiIllIIill;
   private boolean ilIllIIill;
   private final IlIIiIIillIIiIIi iiiIlIIill;
   private final Deque<class_2338> IIIllIIill = new ArrayDeque<>();
   private final lIlIiIIliIlIiIIl liiIlIIill;
   private IiIIiIilliIIiIil iIIllIIill;
   private boolean IlIllIIill;
   public static final int IilIlIIill = 15;

   private class_2338 Illlllllilll(class_638 w) {
      while (!this.IIIllIIill.isEmpty()) {
         class_2338 var2 = this.IIIllIIill.peekFirst();
         if (lliiIliliiIl.lIiiIiIlilli(var2) && !IIiilIiiiIii(w, var2) && !this.IlIillIiilIi(var2)) {
            return var2;
         }

         this.IIIllIIill.pollFirst();
      }

      return null;
   }

   private static class_243 Ililllililil(IIllIIllIllIIl s, IlIillllIill t) {
      if (t.IilliliilIIi() != null) {
         return t.IilliliilIIi();
      } else if (t.lIiiIiIlilli() != null) {
         return lllIliIlillIliIl.liiiIIllIl(t.lIiiIiIlilli());
      } else {
         liiilIiliiiilIil var2 = s.IiIlliIliiIl();
         if (var2 != null) {
            return var2.IIIllIIliIIl() != null ? var2.IIIllIIliIIl() : var2.iliIiiliiiii();
         } else {
            return null;
         }
      }
   }

   public lIIlIllliIIlIlll(lilllllliillllll host, lIlIiIIliIlIiIIl slots) {
      this.lIIllIIill = new HashMap<>();
      this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","LhdCFc9b7ip2ibVCx/o6Kl7SacMYsSpmvUOtgZpfaUo=">();
      this.IiiIlIIill = host;
      this.liiIlIIill = slots;
      this.iiiIlIIill = new IlIIiIIillIIiIIi(host);
   }

   private static boolean Illillliilli(class_638 cell, class_2338 w) {
      long var7 = 826855227357337737L;
      class_2350[] var2 = class_2350.values();
      var7 ^= ((long)var2.length << 32 ^ var7) & -1L << 32;

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         class_2350 var5 = var2[(int)var10];
         if (var5 != class_2350.field_11036) {
            class_2338 var6 = w.method_10093(var5);
            if (!cell.method_8320(var6).method_26220(cell, var6).method_1110()) {
               return true;
            }
         }
      }

      return false;
   }

   public String IIIllIIliIIl() {
      return this.iiIllIIill;
   }

   public void iIlIlllllill() {
      long var8 = -6183859894017641198L;
      long var10 = 3454154567581501429L;
      if (this.IlIllIIill) {
         class_310 var1 = class_310.method_1551();
         class_746 var2 = var1.field_1724;
         class_638 var3 = var1.field_1687;
         if (var2 != null && var3 != null) {
            if (IIllIIlilIllIIli.IlIlllIlilIl() - this.IiIllIIill > 15L) {
               this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","8BeCjWTL6HPw4NfOGE4lXkgx9tBwQ3vFrU3RjXJ2zEgerKE=">();
               if (this.llIllIIill && this.ilIllIIill) {
                  this.IIIilIIiiIIi(this.IIIllIIill.peekFirst());
               }

               this.lIiiIiIlilli();
            } else {
               var8 ^= ((long)this.liiIlIIill.IilliliilIIi(st -> st.method_31574(class_1802.field_8281), false) << 32 ^ var8) & -1L << 32;
               if ((int)(var8 >>> 32) < 0) {
                  this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","sW/L7AUYYpvEBT/+zgLmI7seKsT3DOM6DfzjKbpjwsbVJpyml9pj">();
                  this.lIiiIiIlilli();
               } else {
                  for (long var14 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var14 < 6; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
                     if (!this.llIllIIill && iliilliIiiilli.liiiIIllIl(var3)) {
                        this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","sfIditsI/IcX4pI3uPTv8QW2G0fMiYGzmXLM6Oh65YK24PPr">();
                        return;
                     }

                     if (!this.llIllIIill) {
                        class_2338 var6 = this.Illlllllilll(var3);
                        if (var6 == null) {
                           this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","5epcM9ObnHSx7abCPxJ1IWSZZ9VwNgpq55eA7FwkPJo=">();
                           this.IIlllIlliIll();
                           return;
                        }

                        var10 ^= ((long)(4 + Math.round((float)illIllilIilIllil.IiIlliIliiIl() / 50.0F)) << 32 ^ var10) & -1L << 32;
                        if (!this.iiiIlIIill.IliIlllilIi(var6, (int)(var14 >>> 32), class_2246.field_10540.method_9564(), null, (int)(var10 >>> 32))) {
                           this.IIIllIIill.pollFirst();
                           continue;
                        }

                        this.llIllIIill = true;
                        this.ilIllIIill = false;
                     }

                     lilIillliilIilll var12 = this.iiiIlIIill.iIlIlllllill();
                     if (var12 == lilIillliilIilll.lIIllIlill) {
                        this.liIllIIill++;
                        this.IIIllIIill.pollFirst();
                        this.llIllIIill = false;
                        this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","wpwb4zyF3U+EK5bLczqlBkrt3zP/HNPDm/MUYgZEEgeXKw==">();
                        return;
                     }

                     if (var12 != lilIillliilIilll.iIIllIlill) {
                        if (var12 == lilIillliilIilll.IIIllIlill) {
                           this.ilIllIIill = true;
                        }

                        this.iiIllIIill = var12.name().toLowerCase(Locale.ROOT);
                        return;
                     }

                     this.iiIllIIill = this.iiiIlIIill.IIlllIlliIll() == null
                        ? iiIIlIIlIl<"iiIIlIIlIl","o3KOWkCs3LBoJxLEqQXwdlgqn7G1ZJTiMHWy7SiBf9k++w==">()
                        : this.iiiIlIIill.IIlllIlliIll();
                     this.IIIilIIiiIIi(this.IIIllIIill.pollFirst());
                     this.llIllIIill = false;
                     this.iiiIlIIill.IiIlliIliiIl();
                  }
               }
            }
         } else {
            this.lIiiIiIlilli();
         }
      }
   }

   private static boolean Iilililiiili(class_638 feet, class_2338 w) {
      for (IlillIllllillIll var3 : IilIilllilIill.IilliliilIIi(feet, w, 3, 4)) {
         if (!var3.IliIlllilIi().equals(w) && var3.iIlIlllllill() == 0) {
            return true;
         }
      }

      return false;
   }

   private void IIlllIlliIll() {
      this.iiiIlIIill.IiIlliIliiIl();
      this.IIIllIIill.clear();
      this.IlIllIIill = false;
      this.llIllIIill = false;
   }

   private void IIIilIIiiIIi(class_2338 cell) {
      if (cell != null) {
         this.lIIllIIill.put(cell.method_10063(), IIIiillllIIiilll.IliIlllilIi() + 3000L);
      }
   }

   private boolean IlIillIiilIi(class_2338 cell) {
      return cell != null && IIlilIliiIli(this.lIIllIIill, cell.method_10063(), IIIiillllIIiilll.IliIlllilIi());
   }

   public int IiIlliIliiIl() {
      return this.liIllIIill;
   }

   private static boolean IIiilIiiiIii(class_638 cell, class_2338 w) {
      return !cell.method_8390(class_1511.class, lllIliIlillIliIl.lIiiIiIlilli(w), e -> e.method_5805() && !e.method_31481()).isEmpty();
   }

   private static boolean Iliilliiilii(class_746 cell, class_2338 p) {
      return class_243.method_24953(p).method_1022(cell.method_33571()) <= lliiIliliiIl.liiiIIllIl() + 0.5;
   }

   public boolean IilliliilIIi() {
      return this.IlIllIIill;
   }

   static boolean IIlilIliiIli(Map<Long, Long> key, long now, long blacklist) {
      if (key.isEmpty()) {
         return false;
      } else {
         Iterator var5 = key.entrySet().iterator();

         while (var5.hasNext()) {
            if (blacklist >= (Long)((Entry)var5.next()).getValue()) {
               var5.remove();
            }
         }

         return key.containsKey(now);
      }
   }

   static boolean IiIiliIiiiIi(IIllIIllIllIIl s) {
      if (s == null) {
         return false;
      } else {
         IlIIIlilllIIIlil var1 = s.Iiilliiliiil() != null && s.Iiilliiliiil().IliIlllilIi() != null
            ? s.Iiilliiliiil().IliIlllilIi()
            : IlIIIlilllIIIlil.iliIiilIil;
         return var1 != IlIIIlilllIIIlil.liiIiilIil;
      }
   }

   private iIlillllIllillll IIillIiliIil(IIllIIllIllIIl s) {
      long var14 = 206204806951438787L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      class_638 var4 = var2.field_1687;
      if (var3 != null && var4 != null && s != null && s.IlIlllIlilIl() != null) {
         var14 ^= ((long)this.liiIlIIill.IilliliilIIi(st -> st.method_31574(class_1802.field_8281), false) << 32 ^ var14) & -1L << 32;
         if ((int)(var14 >>> 32) < 0) {
            this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","sW/L7AUYYpvEBT/+zgLmI7seKsT3DOM6DfzjKbpjwsbVJpyml9pj">();
            return null;
         } else if (!var3.method_7294()) {
            this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","j2L+0GfqIT3wA/8ooYDnXNXK0/3aPqmSb+A6A/LnBoY1eRe8gQRf">();
            return null;
         } else {
            IlIillllIill var6 = s.Illlllllilll() == null ? IlIillllIill.IIIIilIilIIIilIi : s.Illlllllilll();
            if (s.Iiiiliiiiiii() == IiIililiIili.liIiiIlIliiIiiIlIl
               && var6.lIiiIiIlilli() != null
               && var6.iliIiiliiiii() >= 8.0F
               && var6.IIIllIIliIIl() <= 0.5F * var6.iliIiiliiiii()) {
               class_2338 var7 = var6.lIiiIiIlilli().method_10084();
               if (!this.IlIillIiilIi(var7)
                  && lliiIliliiIl.lIiiIiIlilli(var7)
                  && !IIiilIiiiIii(var4, var7)
                  && var4.method_8628(class_2246.field_10540.method_9564(), var7, class_3726.method_16194())
                  && Iliilliiilii(var3, var7)) {
                  return new iIlillllIllillll(IiIIiIilliIIiIil.IIillllIil, List.of(var7.method_10062()));
               }
            }

            lliiilIiiliiilIi var16 = s.IlIlllIlilIl();
            class_243 var8 = var16.lIiiIiIlilli() == null ? class_243.field_1353 : var16.lIiiIiIlilli();
            if (!(Math.sqrt(var8.field_1352 * var8.field_1352 + var8.field_1350 * var8.field_1350) >= 0.05) && var16.iliIiiliiiii()) {
               class_2338 var9 = class_2338.method_49638(var16.liiiIIllIl());
               if (Iilililiiili(var4, var9)) {
                  this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","4e++uJ0xqG0N/HPEdelYlLyiuqOKEdtB3ku2Gk8Abqy1W8pcUH8Q">();
                  return null;
               } else {
                  List var10 = this.Iiilliiliiil(var4, var3, var9);
                  if (var10.isEmpty()) {
                     this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","TxnoTZTb5brSxIRpSZ0t0e2S6eeIyzQRxOqjVfAtfCRlDQ==">();
                     return null;
                  } else {
                     ArrayList var11 = new ArrayList(var10.size());

                     for (class_2338 var13 : var10) {
                        if (!this.IlIillIiilIi(var13)) {
                           var11.add(var13);
                        }
                     }

                     if (var11.isEmpty()) {
                        this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","mT/75aTHIcD416Qqlpq52iEboHr5a/m3/YN82N8icp0BBlgNuBQm">();
                        return null;
                     } else if (var16.Iiilliiliiil() < var11.size()) {
                        this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","bYYfDjVwOQyWkc6ZbRt1BSNEAp7yR+3/G7vNe1TLoe3p3tqpbH2O3A==">();
                        return null;
                     } else {
                        class_243 var17 = Ililllililil(s, var6);
                        if (var17 != null) {
                           var11.sort(Comparator.comparingDouble(threat -> class_243.method_24953(threat).method_1025(var17)));
                        }

                        return new iIlillllIllillll(IiIIiIilliIIiIil.iilllllIil, var11);
                     }
                  }
               }
            } else {
               this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","N3/uwtpSzXD0HoLnrNYST/FxNytP30tY4Mrsmev0p+b4TA==">();
               return null;
            }
         }
      } else {
         this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","vMmPWqEbZN2IT+7LZhKxyT6qqSKj98U74euuYm9/eRW7e/87kw==">();
         return null;
      }
   }

   private double Iilllilliill(IIllIIllIllIIl s) {
      if (s == null) {
         return 0.0;
      } else {
         IlIillllIill var2 = s.Illlllllilll() == null ? IlIillllIill.IIIIilIilIIIilIi : s.Illlllllilll();
         IlIIIlilllIIIlil var3 = s.Iiilliiliiil() != null && s.Iiilliiliiil().IliIlllilIi() != null
            ? s.Iiilliiliiil().IliIlllilIi()
            : IlIIIlilllIIIlil.iliIiilIil;
         lilliIiiilliIi var4 = lilliIiiilliIi.IliIlllilIi(s.Iiiiliiiiiii(), var3);
         return (double)(var4.IilliliilIIi() * var2.iliIiiliiiii()) * 0.6;
      }
   }

   public boolean liiiIIllIl(IIllIIllIllIIl s) {
      if (this.IlIllIIill) {
         return false;
      } else if (IiIiliIiiiIi(s)) {
         this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","Bd/uPvHGQOy8JeoPWpbOY2Esj2BmmkImigRneZLOmV8X">();
         return false;
      } else {
         iIlillllIllillll var2 = this.IIillIiliIil(s);
         if (var2 == null) {
            return false;
         } else {
            this.IIIllIIill.clear();
            this.IIIllIIill.addAll(var2.iIIlliIill);
            this.iIIllIIill = var2.lIIlliIill;
            this.IlIllIIill = true;
            this.llIllIIill = false;
            this.IiIllIIill = IIllIIlilIllIIli.IlIlllIlilIl();
            this.liIllIIill = 0;
            this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","P0Q4hUSvOeiyfptbQkkTEGMVoZvVIUiOZjQUVCXnG3mk">();
            return true;
         }
      }
   }

   public void lIiiIiIlilli() {
      this.iiiIlIIill.IiIlliIliiIl();
      this.IIIllIIill.clear();
      this.IlIllIIill = false;
      this.llIllIIill = false;
      this.iIIllIIill = null;
   }

   public IiIIiIilliIIiIil IlIlllIlilIl() {
      return this.iIIllIIill;
   }

   private List<class_2338> Iiilliiliiil(class_638 w, class_746 feet, class_2338 p) {
      long var18 = -4899306200339933892L;
      long var20 = -2758549941466262913L;
      ArrayList var4 = new ArrayList(4);
      List var5 = IilIilllilIill.iIlIlllllill(w, p);
      class_238 var6 = feet.method_5829();
      class_2350[] var7 = iliIlIIill;
      var18 ^= ((long)var7.length << 32 ^ var18) & -1L << 32;

      for (long var23 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var23 < (int)(var23 >>> 32); var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
         class_2350 var10 = var7[(int)var23];
         class_2338 var11 = p.method_10093(var10).method_10062();
         class_2680 var12 = w.method_8320(var11.method_10074());
         var20 ^= ((long)(var12.method_26220(w, var11.method_10074()).method_1110() && !Illillliilli(w, var11) ? 0 : 1) << 32 ^ var20) & -1L << 32;
         if ((int)(var20 >>> 32) != 0) {
            if (var5.contains(var11)) {
               var4.add(var11);
            } else if (lliiIliliiIl.lIiiIiIlilli(var11) && !IIiilIiiiIii(w, var11)) {
               class_238 var14 = lllIliIlillIliIl.lIiiIiIlilli(var11);
               if (var14.method_994(var6)) {
                  var20 ^= (0L ^ var20) & -1L >>> 32;
                  Iterator var16 = w.method_8333(feet, var14, x -> x.method_5805() && !x.method_7325() && !(x instanceof class_1542)).iterator();
                  if (var16.hasNext()) {
                     class_1297 var17 = (class_1297)var16.next();
                     var20 ^= (1L ^ var20) & -1L >>> 32;
                  }

                  if ((int)var20 == 0) {
                     var4.add(var11);
                  }
               }
            }
         }
      }

      return var4;
   }

   public IilliIIllilliIIl IliIlllilIi(IIllIIllIllIIl s) {
      if (this.IlIllIIill) {
         return new IilliIIllilliIIl(
            iIlIIIIiIllIIIIi.iiiiliIiil, true, this.Iilllilliill(s), 0, false, false, iiIIlIIlIl<"iiIIlIIlIl","ImJgA1HpNDFlnPiCzbKgRhjfTYY0ojvxJGA4rTF0Pcw=">()
         );
      } else if (IiIiliIiiiIi(s)) {
         this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","Bd/uPvHGQOy8JeoPWpbOY2Esj2BmmkImigRneZLOmV8X">();
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iiiiliIiil, this.iiIllIIill);
      } else {
         iIlillllIllillll var2 = this.IIillIiliIil(s);
         return var2 == null
            ? IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iiiiliIiil, this.iiIllIIill)
            : new IilliIIllilliIIl(
               iIlIIIIiIllIIIIi.iiiiliIiil,
               true,
               this.Iilllilliill(s),
               2 * var2.iIIlliIill.size() + 1,
               false,
               false,
               var2.lIIlliIill.name().toLowerCase(Locale.ROOT)
            );
      }
   }

   public void iliIiiliiiii() {
      this.lIiiIiIlilli();
      this.lIIllIIill.clear();
      this.liIllIIill = 0;
      this.iiIllIIill = iiIIlIIlIl<"iiIIlIIlIl","LhdCFc9b7ip2ibVCx/o6Kl7SacMYsSpmvUOtgZpfaUo=">();
   }
}
