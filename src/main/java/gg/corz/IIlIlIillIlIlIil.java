package gg.corz;

import java.util.Locale;

public final class IIlIlIillIlIlIil {
   public static final int iiiliiIIil = 10;
   public static final long IiiliiIIil = 10000L;
   public static final long liiliiIIil = 120000L;

   public static long iIlIlllllill(int seconds) {
      return (long)Math.max(0, Math.min(-735696880 + -117 + -17 ^ -735697024, seconds)) * (-1342667740753358728L ^ -1342667740753357936L);
   }

   public static boolean lIiiIiIlilli(String sinceMs, String joined, long wanted) {
      return wanted >= (-9137236603840084406L ^ -9137236603840084406L)
         && wanted <= (-719699111142687407L ^ -719699111142676079L)
         && IilliliilIIi(sinceMs, joined);
   }

   private IIlIlIillIlIlIil() {
   }

   public static ilIIiIllIiIIiIll IliIlllilIi(boolean realm, boolean singleplayer, String address, boolean inWorld, long now, long lastRelogMs) {
      if (!realm) {
         return ilIIiIllIiIIiIll.llilllilll;
      } else if (singleplayer) {
         return ilIIiIllIiIIiIll.ililllilll;
      } else if (address == null || address.isBlank()) {
         return ilIIiIllIiIIiIll.Iiilllilll;
      } else if (inWorld) {
         return ilIIiIllIiIIiIll.liilllilll;
      } else {
         return lastRelogMs > (4582884132298002563L ^ 4582884132298002563L)
               && now >= lastRelogMs
               && now - lastRelogMs < (2124121479158840308L ^ 2124121479158832356L)
            ? ilIIiIllIiIIiIll.iiilllilll
            : ilIIiIllIiIIiIll.IIIillilll;
      }
   }

   public static boolean IilliliilIIi(String a, String b) {
      return a != null && b != null ? a.trim().toLowerCase(Locale.ROOT).equals(b.trim().toLowerCase(Locale.ROOT)) : false;
   }

   public static String liiiIIllIl(ilIIiIllIiIIiIll v) {
      return switch (v) {
         case liilllilll -> iliIiiliiiii<"iliIiiliiiii","Uz9q9Ml1okSqrF249ARvAdAQ01yMy7yxjlNJRqUOxr3bmg6rYreQ8SUIpRx7wyWAEvqqZTih2w7lHGOpj1qhrTlx6x/LXrVvmngFP8s=">();
         case iiilllilll -> iliIiiliiiii<"iliIiiliiiii","uu4IYirzagLzeKp6JZhRjzbpADzhoCyp/3NSAqjBxGLFIJcyi3GXJXfQj8X+c0JUzHp24TMDibrCD3TI3oJfxLtJjQylhFqMn0dy65ZgtNo=">();
         case llilllilll -> iliIiiliiiii<"iliIiiliiiii","w/lwpjSeqI34lFhsyWZHKyr59i6PAfx5NcirqEa2bIr4VbmECfcp3lOZ1jKVK7eXxXJKjXi/lslxUDBABVGyBrbdXEXhRU8QD2goneI=">();
         case ililllilll -> iliIiiliiiii<"iliIiiliiiii","JIzgA8lgO6+vM0iQ4X6Qw/7aByXalFkH4A0Mvn4CnD9rG7QlqwZoc4opmqhgTixcOUp/sMIpcCSrhmGoStI=">();
         default -> null;
      };
   }
}
