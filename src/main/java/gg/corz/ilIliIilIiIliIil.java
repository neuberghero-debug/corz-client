package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.ToIntFunction;

public final class ilIliIilIiIliIil {
   public static final String lIiIIilIil = "Not enough restock containers marked before autobuy";

   public static <K> List<iillllIlIIilllIl<K>> IliIlllilIi(
      Map<K, Integer> maxStack, Map<K, Integer> required, Map<K, Integer> inventory, Map<K, Integer> placed, ToIntFunction<K> stored
   ) {
      ArrayList var5 = new ArrayList();

      for (Entry var7 : maxStack.entrySet()) {
         Object var8 = var7.getKey();
         var5.add(
            iillllIlIIilllIl.IliIlllilIi(
               var8,
               (Integer)var7.getValue(),
               required.getOrDefault(var8, 0),
               inventory.getOrDefault(var8, 0),
               placed.getOrDefault(var8, 0),
               stored.applyAsInt(var8)
            )
         );
      }

      return var5;
   }

   public static <K> String iliIiiliiiii(List<iillllIlIIilllIl<K>> c, IiIlIIllliIlIIll containers, int rows) {
      return IIIllIIliIIl<"IIIllIIliIIl","l9pTDJ79bTDtpPDjogiEgSQhMIgmNHaEmuBamX6HNHl5B4yszew=">()
         + c.size()
         + IIIllIIliIIl<"IIIllIIliIIl","q+aQsjkRNNSS6P5U7FK2rjrTxCnxhX/pnJQwcYIXjPjnVwI+UbaF2w==">()
         + IilliliilIIi(c)
         + IIIllIIliIIl<"IIIllIIliIIl","oCoLsFmcKTuaxahewXvqMZaR1ttuuMmaP4ixVUe1U+ZzujsCX/KBZs5Q">()
         + lIiiIiIlilli(c)
         + IIIllIIliIIl<"IIIllIIliIIl","eYtXjSYTobgIh9igB8a6gDFttfltfV+ZoN/MjJCWSYjDOZoxebAKBpingg==">()
         + containers.iIlIlllllill()
         + IIIllIIliIIl<"IIIllIIliIIl","15Oviu+jnKCxVigI/2TxG2WB9YJNN1FfZE+pz38jhsa5ZxrP4f7man0UXVA=">()
         + containers.IilliliilIIi()
         + IIIllIIliIIl<"IIIllIIliIIl","ZFQPgd8AGHjfVwBxXfWxWKZ4y+LHxQT/Zc3uvKeBjUuvFQcKxlQ0dw==">()
         + rows
         + IIIllIIliIIl<"IIIllIIliIIl","Pnd7vszEfwPodsxLrqFMmvVrgLcwr+TxSHe/+u8CbBKYikolniQKeuJnmeq2C44Y/b4=">()
         + containers.iliIiiliiiii();
   }

   public static <K> int lIiiIiIlilli(List<iillllIlIIilllIl<K>> rows) {
      long var4 = 7271095937976835821L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (iillllIlIIilllIl var3 : rows) {
         var4 ^= ((long)((int)(var4 >>> 32) + var3.IiIlliIliiIl()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   public static <K> IiIlIIllliIlIIll liiiIIllIl(
      List<iillllIlIIilllIl<K>> accessibleContainerFreeSlots, int usableContainers, int freeInventorySlots, int rows, int inaccessibleContainers
   ) {
      long var8 = -3034575539478112189L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for (iillllIlIIilllIl var7 : accessibleContainerFreeSlots) {
         var8 ^= ((long)((int)(var8 >>> 32) + var7.Illlllllilll()) << 32 ^ var8) & -1L << 32;
      }

      var8 ^= ((long)(Math.max(0, usableContainers) + Math.max(0, freeInventorySlots)) ^ var8) & -1L >>> 32;
      return new IiIlIIllliIlIIll((int)(var8 >>> 32), (int)var8, Math.max(0, (int)(var8 >>> 32) - (int)var8), rows, inaccessibleContainers);
   }

   public static <K> int IilliliilIIi(List<iillllIlIIilllIl<K>> rows) {
      long var4 = -691817011860512192L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (iillllIlIIilllIl var3 : rows) {
         var4 ^= ((long)((int)(var4 >>> 32) + var3.iliIiiliiiii()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   private ilIliIilIiIliIil() {
   }

   public static <K> LinkedHashMap<K, Integer> iIlIlllllill(List<iillllIlIIilllIl<K>> rows) {
      LinkedHashMap var1 = new LinkedHashMap();

      for (iillllIlIIilllIl var3 : rows) {
         if (var3.IiIlliIliiIl() > 0) {
            var1.put(var3.iIlIlllllill(), Integer.valueOf(var3.IiIlliIliiIl()));
         }
      }

      return var1;
   }
}
