package gg.corz;

import java.util.List;
import net.minecraft.class_243;

public record ililIlIiIiilIlIi(int pearlId, int ownerId, class_243 landing, int eta, List<class_243> tail, long seenTick) {
   private final List<class_243> IllIlIIIIi;
   private final int iIlIlIIIIi;
   private final class_243 lIlIlIIIIi;
   private final long lllIlIIIIi;
   private final int IIlIlIIIIi;
   private final int iiIIlIIIIi;

   public int IilliliilIIi() {
      return this.iIlIlIIIIi;
   }

   public ililIlIiIiilIlIi(int pearlId, int ownerId, class_243 landing, int eta, List<class_243> tail, long seenTick) {
      this.iiIIlIIIIi = pearlId;
      this.IIlIlIIIIi = ownerId;
      this.lIlIlIIIIi = landing;
      this.iIlIlIIIIi = eta;
      this.IllIlIIIIi = tail;
      this.lllIlIIIIi = seenTick;
   }

   public long iliIiiliiiii() {
      return this.lllIlIIIIi;
   }

   public List<class_243> lIiiIiIlilli() {
      return this.IllIlIIIIi;
   }

   public int liiiIIllIl() {
      return this.IIlIlIIIIi;
   }

   public class_243 iIlIlllllill() {
      return this.lIlIlIIIIi;
   }

   public int IliIlllilIi() {
      return this.iiIIlIIIIi;
   }
}
