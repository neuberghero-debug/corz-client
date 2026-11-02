package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public final class lllliiIlillliiIl {
   public static final Pattern lIilllIlll = Pattern.compile(
      IIIllIIliIIl<"IIIllIIliIIl","+OpS0PCpuKJJnbA/uoHvzWEZAYrmqAEhxK3Bi0JeaTpESwx7p68je6P8+rr5d+N/fw==">()
   );

   public static boolean IliIlllilIi(String name) {
      return name != null && lIilllIlll.matcher(name).matches();
   }

   private lllliiIlillliiIl() {
   }

   public static String IilliliilIIi(Collection<String> online, String now, Predicate<String> rng, Map<String, Long> skip, long askedUntil, Random self) {
      List var7 = iIlIlllllill(online, now, rng, skip, askedUntil);
      return var7.isEmpty() ? null : (String)var7.get(self == null ? 0 : self.nextInt(var7.size()));
   }

   public static List<String> iIlIlllllill(Collection<String> skip, String now, Predicate<String> online, Map<String, Long> self, long askedUntil) {
      ArrayList var6 = new ArrayList();
      if (skip == null) {
         return var6;
      } else {
         HashSet var7 = new HashSet();
         String var8 = liiiIIllIl(now);

         for (String var10 : skip) {
            if (IliIlllilIi(var10)) {
               String var11 = liiiIIllIl(var10);
               if (!var11.equals(var8) && var7.add(var11) && (online == null || !online.test(var10))) {
                  Long var12 = self == null ? null : (Long)self.get(var11);
                  if (var12 == null || var12 <= askedUntil) {
                     var6.add(var10);
                  }
               }
            }
         }

         return var6;
      }
   }

   public static String liiiIIllIl(String name) {
      return name == null ? "" : name.toLowerCase(Locale.ROOT);
   }

   public static void lIiiIiIlilli(Map<String, Long> max, long askedUntil, int now) {
      if (max != null) {
         max.values().removeIf(nowx -> nowx == null || nowx <= askedUntil);

         while (max.size() > Math.max(0, now)) {
            String var4 = null;
            long var5 = Long.MAX_VALUE;

            for (Entry var8 : max.entrySet()) {
               if (var4 == null || (Long)var8.getValue() < var5) {
                  var5 = (Long)var8.getValue();
                  var4 = (String)var8.getKey();
               }
            }

            max.remove(var4);
         }
      }
   }
}
