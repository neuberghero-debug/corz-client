package gg.corz;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1304;
import net.minecraft.class_1320;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_4174;
import net.minecraft.class_5134;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9334;
import net.minecraft.class_9636;
import net.minecraft.class_1322.class_1323;

public final class iIliilIlIlliilIl {
   private static final List<class_5321<class_1887>> liIiiilIll = List.of(
      class_1893.field_9103, class_1893.field_9116, class_1893.field_9126, class_1893.field_9125, class_1893.field_9101, class_1893.field_9119
   );
   private static final List<class_5321<class_1887>> iiIiiilIll = List.of(
      class_1893.field_9098, class_1893.field_9108, class_1893.field_9132, class_1893.field_9101, class_1893.field_9119
   );
   private static final List<class_5321<class_1887>> IIliiilIll = List.of(
      class_1893.field_9111, class_1893.field_9095, class_1893.field_9107, class_1893.field_9096, class_1893.field_9129
   );
   private static final List<class_5321<class_1887>> ilIiiilIll = List.of(
      class_1893.field_9118,
      class_1893.field_9121,
      class_1893.field_9115,
      class_1893.field_50157,
      class_1893.field_50158,
      class_1893.field_50159,
      class_1893.field_9120,
      class_1893.field_9104,
      class_1893.field_9117,
      class_1893.field_9106,
      class_1893.field_63420
   );
   private static final List<class_5321<class_1887>> IiIiiilIll = List.of(class_1893.field_9131, class_1893.field_9130, class_1893.field_9099);

   public static double IIIllIIliIIl(class_1799 s) {
      long var5 = -4265009195326504769L;
      class_1844 var1 = (class_1844)s.method_58694(class_9334.field_49651);
      if (var1 == null) {
         return 0.0;
      } else {
         var5 ^= (-4294967296L ^ var5) & -1L << 32;

         for (class_1293 var4 : var1.method_57397()) {
            if (Ililllililil(var4.method_5579(), class_1294.field_5915)) {
               var5 ^= ((long)Math.max((int)(var5 >>> 32), var4.method_5578()) << 32 ^ var5) & -1L << 32;
            }
         }

         if ((int)(var5 >>> 32) < 0) {
            return 0.0;
         } else {
            double var7 = s.method_31574(class_1802.field_8436) ? 20.0 : (s.method_31574(class_1802.field_8150) ? 10.0 : 0.0);
            return 1.0 + var7 + (double)((int)(var5 >>> 32));
         }
      }
   }

   public static boolean IlIlllIlilIl(class_1799 s) {
      return IIIllIIliIIl(s) > 0.0;
   }

   public static double IliIlllilIi(class_1799 s, ilIlIiilIiIlIiil kind) {
      if (s != null && !s.method_7960() && kind != null) {
         double var2 = IilliliilIIi(s);

         return switch (kind) {
            case IIiIiillil, lIiIiillil -> IiIlliIliiIl(s, 0.0, var2);
            case lliIiillil -> IiIlliIliiIl(s, 0.3 * (double)Iiilliiliiil(s, class_1893.field_63420), var2);
            case iIiIiillil -> IiIlliIliiIl(
            s,
            0.5 * (double)Iiilliiliiil(s, class_1893.field_50157)
               + 0.6 * (double)Iiilliiliiil(s, class_1893.field_50158)
               + 0.3 * (double)Iiilliiliiil(s, class_1893.field_50159),
            var2
         );
            case IliIiillil -> IiIlliIliiIl(
            s,
            0.3 * (double)Iiilliiliiil(s, class_1893.field_9120)
               + 0.3 * (double)Iiilliiliiil(s, class_1893.field_9104)
               + 0.2 * (double)Iiilliiliiil(s, class_1893.field_9117)
               + 0.05 * (double)Iiilliiliiil(s, class_1893.field_9106),
            var2
         );
            case iliIiillil -> IIlllIlliIll(s, class_2246.field_10340, Illlllllilll(s), var2);
            case IiiIiillil -> IIlllIlliIll(s, class_2246.field_10566, 0, var2);
            case liiIiillil -> IllIiiIllllIiiIl.IiIlliIliiIl(
            Iiilliiliiil(s, class_1893.field_9103),
            Iiilliiliiil(s, class_1893.field_9116),
            Iiilliiliiil(s, class_1893.field_9126),
            Iiilliiliiil(s, class_1893.field_9125),
            Iiilliiliiil(s, class_1893.field_9101),
            Iiilliiliiil(s, class_1893.field_9119),
            IIIilIIiiIIi(s, liIiiilIll),
            var2
         );
            case iiiIiillil -> IllIiiIllllIiiIl.IIlllIlliIll(
            Iiilliiliiil(s, class_1893.field_9098),
            Iiilliiliiil(s, class_1893.field_9108),
            Iiilliiliiil(s, class_1893.field_9132),
            Iiilliiliiil(s, class_1893.field_9101),
            Iiilliiliiil(s, class_1893.field_9119),
            IIIilIIiiIIi(s, iiIiiilIll),
            var2
         );
            case IIIliillil, lIIliillil, iIIliillil, IlIliillil -> Iilllilliill(s, kind.IliIlllilIi(), var2);
         };
      } else {
         return 0.0;
      }
   }

   public static double iliIiiliiiii(class_1799 s) {
      return IllIiiIllllIiiIl.IIillIiliIil(IIIilIIiiIIi(s, List.of()), IilliliilIIi(s));
   }

   private iIliilIlIlliilIl() {
   }

   public static double liiiIIllIl(class_1799 s, ilIlIiilIiIlIiil kind) {
      if (s != null && !s.method_7960() && kind != null) {
         return switch (kind) {
            case IIiIiillil, lIiIiillil, lliIiillil, iIiIiillil, IliIiillil -> IIillIiliIil(s, class_1304.field_6173, class_5134.field_23721);
            case iliIiillil -> IllIiiIllllIiiIl.IIIllIIliIIl(Illlllllilll(s), (double)s.method_7924(class_2246.field_10340.method_9564()), s.method_7936());
            case IiiIiillil -> IllIiiIllllIiiIl.IIIllIIliIIl(0, (double)s.method_7924(class_2246.field_10566.method_9564()), s.method_7936());
            case liiIiillil, iiiIiillil -> 0.0;
            case IIIliillil, lIIliillil, iIIliillil, IlIliillil -> IllIiiIllllIiiIl.IlIlllIlilIl(
            IIillIiliIil(s, kind.IliIlllilIi(), class_5134.field_23724),
            IIillIiliIil(s, kind.IliIlllilIi(), class_5134.field_23725),
            IIillIiliIil(s, kind.IliIlllilIi(), class_5134.field_23718)
         );
         };
      } else {
         return 0.0;
      }
   }

   static int Illlllllilll(class_1799 s) {
      if (s.method_7951(class_2246.field_10540.method_9564())) {
         return 3;
      } else if (s.method_7951(class_2246.field_10442.method_9564())) {
         return 2;
      } else {
         return s.method_7951(class_2246.field_10212.method_9564()) ? 1 : 0;
      }
   }

   public static double lIiiIiIlilli(class_1799 s) {
      class_4174 var1 = (class_4174)s.method_58694(class_9334.field_50075);
      return var1 == null ? 0.0 : IllIiiIllllIiiIl.Iilllilliill(var1.comp_2491(), var1.comp_2492());
   }

   public static Map<String, Integer> iIlIlllllill(class_1799 curses, boolean s) {
      HashMap var2 = null;

      for (Entry var4 : curses.method_58657().method_57539()) {
         if (((class_6880)var4.getKey()).method_40220(class_9636.field_51551) == s && var4.getIntValue() > 0) {
            if (var2 == null) {
               var2 = new HashMap();
            }

            var2.merge(((class_6880)var4.getKey()).method_55840(), var4.getIntValue(), Math::max);
         }
      }

      return (Map<String, Integer>)(var2 == null ? Map.of() : var2);
   }

   static <T> boolean Ililllililil(class_6880<T> b, class_6880<T> a) {
      if (b == a) {
         return true;
      } else {
         Optional var2 = a.method_40230();
         return var2.isPresent() && b.method_40225((class_5321)var2.get());
      }
   }

   static double IIillIiliIil(class_1799 s, class_1304 attribute, class_6880<class_1320> slot) {
      double[] var3 = new double[1];
      s.method_57354(attribute, (attributex, modifier) -> {
         if (Ililllililil(attributex, slot) && modifier.comp_2450() == class_1323.field_6328) {
            var3[0] += modifier.comp_2449();
         }
      });
      return var3[0];
   }

   static int Iiilliiliiil(class_1799 s, class_5321<class_1887> key) {
      for (Entry var3 : s.method_58657().method_57539()) {
         if (((class_6880)var3.getKey()).method_40225(key)) {
            return var3.getIntValue();
         }
      }

      return 0;
   }

   public static double IilliliilIIi(class_1799 s) {
      return s != null && !s.method_7960() && s.method_7963() ? IllIiiIllllIiiIl.IilliliilIIi(s.method_7919(), s.method_7936()) : 1.0;
   }

   static double IIlllIlliIll(class_1799 s, class_2248 probe, int tier, double dur) {
      float var5 = s.method_7924(probe.method_9564());
      double var6 = 0.3 * (double)Iiilliiliiil(s, class_1893.field_9130) + 0.6 * (double)Iiilliiliiil(s, class_1893.field_9099);
      return IllIiiIllllIiiIl.iliIiiliiiii(tier, var5, Iiilliiliiil(s, class_1893.field_9131), s.method_7936(), var6, IIIilIIiiIIi(s, IiIiiilIll), dur);
   }

   static double Iilllilliill(class_1799 dur, class_1304 slot, double s) {
      long var11 = 3013737449075618080L;
      double var4 = IIillIiliIil(dur, slot, class_5134.field_23724);
      double var6 = IIillIiliIil(dur, slot, class_5134.field_23725);
      double var8 = IIillIiliIil(dur, slot, class_5134.field_23718);
      var11 ^= (
            (long)(
                     Iiilliiliiil(dur, class_1893.field_9095)
                        + Iiilliiliiil(dur, class_1893.field_9107)
                        + Iiilliiliiil(dur, class_1893.field_9096)
                        + Iiilliiliiil(dur, class_1893.field_9129)
                  )
                  << 32
               ^ var11
         )
         & -1L << 32;
      return IllIiiIllllIiiIl.Illlllllilll(var4, var6, var8, Iiilliiliiil(dur, class_1893.field_9111), (int)(var11 >>> 32), IIIilIIiiIIi(dur, IIliiilIll), s);
   }

   static int IIIilIIiiIIi(class_1799 s, List<class_5321<class_1887>> counted) {
      long var9 = 3963041808792781265L;
      var9 ^= (0L ^ var9) & -1L << 32;

      for (Entry var4 : s.method_58657().method_57539()) {
         class_6880 var5 = (class_6880)var4.getKey();
         if (!var5.method_40220(class_9636.field_51551)) {
            var9 ^= (0L ^ var9) & -1L >>> 32;

            for (class_5321 var8 : counted) {
               if (var5.method_40225(var8)) {
                  var9 ^= (1L ^ var9) & -1L >>> 32;
                  break;
               }
            }

            if ((int)var9 == 0) {
               var9 ^= ((long)((int)(var9 >>> 32) + var4.getIntValue()) << 32 ^ var9) & -1L << 32;
            }
         }
      }

      return (int)(var9 >>> 32);
   }

   static double IiIlliIliiIl(class_1799 kindExtras, double dur, double s) {
      double var5 = IIillIiliIil(kindExtras, class_1304.field_6173, class_5134.field_23721);
      double var7 = dur + 0.05 * (double)(Iiilliiliiil(kindExtras, class_1893.field_9121) + Iiilliiliiil(kindExtras, class_1893.field_9115));
      return IllIiiIllllIiiIl.lIiiIiIlilli(var5, Iiilliiliiil(kindExtras, class_1893.field_9118), var7, IIIilIIiiIIi(kindExtras, ilIiiilIll), s);
   }
}
