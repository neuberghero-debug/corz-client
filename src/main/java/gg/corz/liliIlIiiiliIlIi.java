package gg.corz;

import java.util.List;
import java.util.Map;

public record liliIlIiiiliIlIi(Map<Long, Long> anchorByTarget, List<Long> anchors, Map<Long, Integer> coverage) {
   private final List<Long> ilIliIIIIi;
   public static final liliIlIiiiliIlIi liIliIIIIi = new liliIlIiiiliIlIi(Map.of(), List.of(), Map.of());
   private final Map<Long, Integer> IiIliIIIIi;
   private final Map<Long, Long> llIliIIIIi;

   public Map<Long, Integer> iIlIlllllill() {
      return this.IiIliIIIIi;
   }

   public liliIlIiiiliIlIi(Map<Long, Long> anchorByTarget, List<Long> anchors, Map<Long, Integer> coverage) {
      anchorByTarget = Map.copyOf(anchorByTarget == null ? Map.of() : anchorByTarget);
      anchors = List.copyOf(anchors == null ? List.of() : anchors);
      coverage = Map.copyOf(coverage == null ? Map.of() : coverage);
      this.llIliIIIIi = anchorByTarget;
      this.ilIliIIIIi = anchors;
      this.IiIliIIIIi = coverage;
   }

   public Map<Long, Long> IliIlllilIi() {
      return this.llIliIIIIi;
   }

   public List<Long> liiiIIllIl() {
      return this.ilIliIIIIi;
   }
}
