package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class illIiIIlIilIiIIl {
   public static final List<String> iIiiIIilIl = List.of(
      IIlilIliiIli<"IIlilIliiIli","RzzP0mUQX6eyN2455A6zQapF2ZplMY09cjLRAzLCsiE=">(),
      IIlilIliiIli<"IIlilIliiIli","ovK68cQbswNOpjxIZuqgnVqVh5jfAKZ86UjgHUhR">(),
      IIlilIliiIli<"IIlilIliiIli","bkQQO+rsN+ePIPW0UTetW3lW7EdSuvsyWc57cdpqHMv+">(),
      IIlilIliiIli<"IIlilIliiIli","56QlifB9yDz4Rdsdb8W+TW3AJx2X2jeqBgfvsfgsHJw9">(),
      IIlilIliiIli<"IIlilIliiIli","QpZuD6tD8jpLa4s3PrCDiL+auPNQTgKChHCXAxCPz7w=">(),
      IIlilIliiIli<"IIlilIliiIli","b7VzUUxoG93RmitACe22/braw6TFUpRu8Oi8YzMJ7iE=">()
   );

   public static int liiiIIllIl(int wantedFacing, boolean facesPlacer) {
      if (wantedFacing >= 0 && !iiIiIIilIIliIIil.iIlIlllllill(wantedFacing)) {
         return facesPlacer ? iiIiIIilIIliIIil.IliIlllilIi(wantedFacing) : wantedFacing;
      } else {
         return -1;
      }
   }

   public static boolean Iilllilliill(boolean anyMissing, boolean anyPlacementItemAvailable) {
      return anyMissing && !anyPlacementItemAvailable;
   }

   private static float lIiiIiIlilli(float degrees) {
      float var1 = degrees % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public static boolean IIlllIlliIll(Map<String, String> actual, Map<String, String> wanted) {
      for (String var3 : iIiiIIilIl) {
         if (!Boolean.parseBoolean(actual.getOrDefault(var3, IIlilIliiIli<"IIlilIliiIli","EwWtCCRaUeNKS35iYbp2aiZZ8qSMFoN8R96FXI4PP4Ll">()))
            && Boolean.parseBoolean(wanted.getOrDefault(var3, IIlilIliiIli<"IIlilIliiIli","EwWtCCRaUeNKS35iYbp2aiZZ8qSMFoN8R96FXI4PP4Ll">()))) {
            return true;
         }
      }

      return false;
   }

   public static boolean IiIiliIiiiIi(int axis, String look) {
      long var4 = -1763151530296262652L;
      if (look == null) {
         return true;
      } else {
         var4 ^= ((long)(axis != 5 && axis != 4 ? 0 : 1) << 32 ^ var4) & -1L << 32;
         var4 ^= ((long)(axis != 2 && axis != 3 ? 0 : 1) ^ var4) & -1L >>> 32;
         return (boolean)(IIlilIliiIli<"IIlilIliiIli","s2Mgr7qzTr82d5WDZ1WEZqiSvATXiLWxhZQzE0c=">().equals(look)
            ? (int)(var4 >>> 32)
            : (IIlilIliiIli<"IIlilIliiIli","U5X93TX5O10rGq6SLxPTnpkEL+6OYq3FHvUIWec=">().equals(look) ? (int)var4 : 0));
      }
   }

   public static boolean Illlllllilll(String actualType, String partnerPresent, boolean wantedType) {
      return !wantedType
         && !IIlilIliiIli<"IIlilIliiIli","+KgYwHCiF6SBFX7SpyfJl7QgO4Nw4tYsS3vmJZwMuxwKog==">().equals(actualType)
         && IIlilIliiIli<"IIlilIliiIli","+KgYwHCiF6SBFX7SpyfJl7QgO4Nw4tYsS3vmJZwMuxwKog==">().equals(partnerPresent);
   }

   private illIiIIlIilIiIIl() {
   }

   public static boolean iliIiiliiiii(String actualFacing, String wantFacing, String wantType, String actualType) {
      if (actualFacing != null && wantFacing != null && wantType != null && actualType != null) {
         return !IIlilIliiIli<"IIlilIliiIli","+KgYwHCiF6SBFX7SpyfJl7QgO4Nw4tYsS3vmJZwMuxwKog==">().equals(wantFacing)
               && !IIlilIliiIli<"IIlilIliiIli","+KgYwHCiF6SBFX7SpyfJl7QgO4Nw4tYsS3vmJZwMuxwKog==">().equals(actualType)
            ? IIIllIIliIIl(actualFacing).equals(wantType) && IlIlllIlilIl(wantFacing).equals(actualType)
            : false;
      } else {
         return false;
      }
   }

   public static int IliIlllilIi(illIlIIiIilIlIIi wantedFacing, int mount) {
      return switch (wantedFacing) {
         case IilIilliil -> 0;
         case lllIilliil -> iiIiIIilIIliIIil.IliIlllilIi(mount);
         case illIilliil -> 1;
      };
   }

   private static String IlIlllIlilIl(String t) {
      long var3 = -4480652488857412657L;
      var3 ^= (-4294967296L ^ var3) & -1L << 32;
      switch (t.hashCode()) {
         case 3317767:
            if (t.equals(IIlilIliiIli<"IIlilIliiIli","aHqwK+JlcVheUoBDo6kdMT7AnHPpb3emcP8ySkZ5qtc=">())) {
               var3 ^= (0L ^ var3) & -1L << 32;
            }
            break;
         case 108511772:
            if (t.equals(IIlilIliiIli<"IIlilIliiIli","zk1JsMpEJltxwCdc7Pm2Oe6x9lgYivNiT+FEQaPOSwUC">())) {
               var3 ^= (4294967296L ^ var3) & -1L << 32;
            }
      }
      return switch ((int)(var3 >>> 32)) {
         case 0 -> IIlilIliiIli<"IIlilIliiIli","zk1JsMpEJltxwCdc7Pm2Oe6x9lgYivNiT+FEQaPOSwUC">();
         case 1 -> IIlilIliiIli<"IIlilIliiIli","aHqwK+JlcVheUoBDo6kdMT7AnHPpb3emcP8ySkZ5qtc=">();
         default -> "";
      };
   }

   public static int IilliliilIIi(float playerYaw) {
      return Math.floorMod((int)Math.floor((double)((playerYaw + 180.0F) / 22.5F + 0.5F)), 16);
   }

   public static float iIlIlllllill(int rotation) {
      long var2 = 6637069553845437879L;
      var2 ^= ((long)Math.floorMod(rotation, 16) << 32 ^ var2) & -1L << 32;
      return lIiiIiIlilli((float)((int)(var2 >>> 32)) * 22.5F - 180.0F);
   }

   private static String IIIllIIliIIl(String f) {
      long var3 = -5730347011090844812L;
      var3 ^= (-4294967296L ^ var3) & -1L << 32;
      switch (f.hashCode()) {
         case 3105789:
            if (f.equals(IIlilIliiIli<"IIlilIliiIli","b7VzUUxoG93RmitACe22/braw6TFUpRu8Oi8YzMJ7iE=">())) {
               var3 ^= (8589934592L ^ var3) & -1L << 32;
            }
            break;
         case 3645871:
            if (f.equals(IIlilIliiIli<"IIlilIliiIli","QpZuD6tD8jpLa4s3PrCDiL+auPNQTgKChHCXAxCPz7w=">())) {
               var3 ^= (12884901888L ^ var3) & -1L << 32;
            }
            break;
         case 105007365:
            if (f.equals(IIlilIliiIli<"IIlilIliiIli","bkQQO+rsN+ePIPW0UTetW3lW7EdSuvsyWc57cdpqHMv+">())) {
               var3 ^= (0L ^ var3) & -1L << 32;
            }
            break;
         case 109627853:
            if (f.equals(IIlilIliiIli<"IIlilIliiIli","56QlifB9yDz4Rdsdb8W+TW3AJx2X2jeqBgfvsfgsHJw9">())) {
               var3 ^= (4294967296L ^ var3) & -1L << 32;
            }
      }
      return switch ((int)(var3 >>> 32)) {
         case 0 -> IIlilIliiIli<"IIlilIliiIli","56QlifB9yDz4Rdsdb8W+TW3AJx2X2jeqBgfvsfgsHJw9">();
         case 1 -> IIlilIliiIli<"IIlilIliiIli","bkQQO+rsN+ePIPW0UTetW3lW7EdSuvsyWc57cdpqHMv+">();
         case 2 -> IIlilIliiIli<"IIlilIliiIli","QpZuD6tD8jpLa4s3PrCDiL+auPNQTgKChHCXAxCPz7w=">();
         case 3 -> IIlilIliiIli<"IIlilIliiIli","b7VzUUxoG93RmitACe22/braw6TFUpRu8Oi8YzMJ7iE=">();
         default -> "";
      };
   }

   public static List<String> IiIlliIliiIl(Map<String, String> wanted, Map<String, String> actual) {
      ArrayList var2 = new ArrayList();

      for (String var4 : iIiiIIilIl) {
         if (Boolean.parseBoolean(wanted.getOrDefault(var4, IIlilIliiIli<"IIlilIliiIli","EwWtCCRaUeNKS35iYbp2aiZZ8qSMFoN8R96FXI4PP4Ll">()))
            && !Boolean.parseBoolean(actual.getOrDefault(var4, IIlilIliiIli<"IIlilIliiIli","EwWtCCRaUeNKS35iYbp2aiZZ8qSMFoN8R96FXI4PP4Ll">()))) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public static String IIIilIIiiIIi(String shape) {
      long var3 = 1734403786409753045L;
      if (shape == null) {
         return null;
      } else {
         var3 ^= (-4294967296L ^ var3) & -1L << 32;
         switch (shape.hashCode()) {
            case -1823545122:
               if (shape.equals(IIlilIliiIli<"IIlilIliiIli","CSYASFvfM2k1co3pzcP8GAuhqqybhxYqnKLJb9cjK69nFJZeFVrr6q393w==">())) {
                  var3 ^= (4294967296L ^ var3) & -1L << 32;
               }
               break;
            case -1818924634:
               if (shape.equals(IIlilIliiIli<"IIlilIliiIli","JnO6q9cv/cPVzIBLty3y+yot5Ik8IP82rFBJd18hMKtC3/enfmQcsB807g==">())) {
                  var3 ^= (8589934592L ^ var3) & -1L << 32;
               }
               break;
            case 617340435:
               if (shape.equals(IIlilIliiIli<"IIlilIliiIli","634Lstzm2I66x7wbQOynVeIxbzNR6ypwwvihqOTELV6o+AzPn+nj">())) {
                  var3 ^= (0L ^ var3) & -1L << 32;
               }
               break;
            case 1603462404:
               if (shape.equals(IIlilIliiIli<"IIlilIliiIli","mZYbR3CynKTz+dHmoM1mvulQcIK5M2mOQK3fRlgkbkqdrNve3I2+2RST">())) {
                  var3 ^= (17179869184L ^ var3) & -1L << 32;
               }
               break;
            case 1604002486:
               if (shape.equals(IIlilIliiIli<"IIlilIliiIli","ZSVJGLIj0b106lAdlzW2p220Op9K2tZskeafZBRDu6soppbr+EvmKJWM">())) {
                  var3 ^= (21474836480L ^ var3) & -1L << 32;
               }
               break;
            case 1780673713:
               if (shape.equals(IIlilIliiIli<"IIlilIliiIli","vQECk5xX4OXh5gY6sTsFG5v18ARFtCej7iJ4vC/TICU7Sw2tSQ==">())) {
                  var3 ^= (12884901888L ^ var3) & -1L << 32;
               }
         }
         return switch ((int)(var3 >>> 32)) {
            case 0, 1, 2 -> IIlilIliiIli<"IIlilIliiIli","U5X93TX5O10rGq6SLxPTnpkEL+6OYq3FHvUIWec=">();
            case 3, 4, 5 -> IIlilIliiIli<"IIlilIliiIli","s2Mgr7qzTr82d5WDZ1WEZqiSvATXiLWxhZQzE0c=">();
            default -> null;
         };
      }
   }

   public static boolean Ililllililil(int confirmedBreaks, int limit) {
      return confirmedBreaks < Math.max(0, limit);
   }

   public static boolean IlIillIiilIi(String neighboursComplete, String got, boolean want) {
      if (neighboursComplete == null || got == null) {
         return false;
      } else if (neighboursComplete.equals(got)) {
         return true;
      } else if (!want && Iiilliiliiil(got)) {
         String var3 = IIIilIIiiIIi(neighboursComplete);
         return var3 == null || var3.equals(IIIilIIiiIIi(got));
      } else {
         return false;
      }
   }

   private static boolean Iiilliiliiil(String shape) {
      return IIlilIliiIli<"IIlilIliiIli","634Lstzm2I66x7wbQOynVeIxbzNR6ypwwvihqOTELV6o+AzPn+nj">().equals(shape)
         || IIlilIliiIli<"IIlilIliiIli","vQECk5xX4OXh5gY6sTsFG5v18ARFtCej7iJ4vC/TICU7Sw2tSQ==">().equals(shape);
   }

   public static boolean IIillIiliIil(boolean interactive, boolean fullCube, boolean materialInHotbar, boolean defaultState, boolean stateful) {
      return !interactive && !fullCube && materialInHotbar && defaultState && stateful;
   }
}
